package week3;

import java.util.Scanner;

public class A033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i] += scanner.nextInt();
            }
        }

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index+1);
        System.out.println(max);
    }
}

