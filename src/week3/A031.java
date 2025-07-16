package week3;

import java.util.Scanner;

public class A031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // row
        int m = scanner.nextInt();  // col

        System.out.println(n * m - 1);
    }
}
