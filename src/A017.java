import java.util.*;

public class A017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[10];

        while (n > 0) {
            int digit = n % 10;
            if (digit == 6 || digit == 9) {
                arr[6]++;
            } else {
                arr[digit]++;
            }
            n /= 10;
        }

        arr[6] = (int) Math.round((arr[6]/2.0));

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);


    }
}