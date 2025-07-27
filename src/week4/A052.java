package week4;

import java.util.Scanner;
import java.util.Stack;

public class A052 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String arr[] = new String[n];
        int ans[] = new int[n];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (ch == 'O') {
                    stack.push(j);
                } else {
                    int num = stack.size();
                    ans[i] += num * (num + 1) / 2;
                    stack.clear();
                }
            }

            if (!stack.isEmpty()) {
                int num = stack.size();
                ans[i] += num * (num + 1) / 2;
            }
        }



        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

}



