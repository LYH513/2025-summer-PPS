import java.util.*;

public class A021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        sum = sum-(n-1);

        System.out.println(sum);
    }
}