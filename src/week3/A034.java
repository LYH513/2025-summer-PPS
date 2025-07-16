package week3;

import java.util.Scanner;

public class A034 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int count[] = new int[42];

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            arr[i] = a % 42;
        }

        for (int i = 0; i < 10; i++) {
            count[arr[i]] ++;
        }

        int total = 0;

        for (int i = 0; i < 42; i++) {
            if (count[i] != 0) {
                total ++;
            }
        }

        System.out.println(total);

    }
}