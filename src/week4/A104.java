package week4;

import java.util.Scanner;

public class A104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 마을 수
        int[] cost = new int[N];

        int totalClockwise = 0;
        for (int i = 0; i < N; i++) {
            cost[i] = sc.nextInt();
            totalClockwise += cost[i];
        }

        // 시계방향 vs 반시계방향: 둘 다 비용이 같기 때문에
        // 이 문제에서는 그냥 totalClockwise 가 정답
        // (만약 시계/반시계가 다르면 아래와 같이 두 방향 계산 필요)

        // 반시계 방향 비용 계산 (배열 뒤집기)
        int totalCounterClockwise = 0;
        for (int i = N - 1; i >= 0; i--) {
            totalCounterClockwise += cost[i];
        }

        System.out.println(Math.min(totalClockwise, totalCounterClockwise));
    }
}
