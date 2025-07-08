package week1;

import java.util.*;

public class A019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(B[i]);
        }
        Arrays.sort(A);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int max = Collections.max(list);
            sum += A[i]*max;
            list.remove(Integer.valueOf(max));
        }

        System.out.println(sum);

    }
}