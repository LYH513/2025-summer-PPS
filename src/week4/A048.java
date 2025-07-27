package week4;

import java.util.Scanner;
import java.util.Stack;

public class A048 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            arr[i] = a;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            stack.clear();
            for(int j = 0; j < arr[i].length(); j++) {
                if(!stack.isEmpty() && (stack.search(arr[i].charAt(j))) != -1 ){
                    if(stack.peek() != arr[i].charAt(j)) {
                        break;
                    }
                }

                stack.push(arr[i].charAt(j));
                if(j == arr[i].length() - 1) {
                    count++;
                }

            }
        }

        System.out.println(count);

    }

}
