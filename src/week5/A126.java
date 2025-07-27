package week5;

import java.util.Scanner;

public class A126 {
    public static boolean isHansu(int num) {
        if (num < 100) return true;

        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        return (a - b) == (b - c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isHansu(i)) count++;
        }

        System.out.println(count);
    }
}
