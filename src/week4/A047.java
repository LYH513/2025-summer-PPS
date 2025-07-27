package week4;

import java.util.Scanner;

public class A047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length() / 10 + 1;
        String arr[] = new String[len];

        for (int i = 0; i < len; i++) {
            String temp = "";
            if (i != len - 1) {
                temp = s.substring(i * 10, (i + 1) * 10);
            } else {
                temp = s.substring(i * 10, s.length());
            }
            arr[i] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
