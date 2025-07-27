package week6;

import java.util.*;

public class A107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] sequence = new int[1001];
        int index = 1;
        int num = 1;

        while (index <= 1000) {
            for (int i = 0; i < num && index <= 1000; i++) {
                sequence[index++] = num;
            }
            num++;
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += sequence[i];
        }

        System.out.println(sum);
    }
}

