package week1;

import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int t = 0; t < C; t++) {
            int N = sc.nextInt();
            int[] scores = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            double avg = (double) sum / N;
            int countAboveAvg = 0;

            for (int score : scores) {
                if (score > avg) {
                    countAboveAvg++;
                }
            }

            double rate = (double) countAboveAvg / N * 100;

            System.out.printf("%.3f%%\n", rate);
        }
    }
}
