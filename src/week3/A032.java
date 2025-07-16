package week3;
import java.util.Scanner;

public class A032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        while (T-- > 0) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호

            int[][] dp = new int[k + 1][n + 1];

            // 0층 초기화: i호엔 i명
            for (int i = 1; i <= n; i++) {
                dp[0][i] = i;
            }

            // DP 계산
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}
