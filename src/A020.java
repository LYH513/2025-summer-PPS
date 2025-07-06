import java.util.*;

public class A020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[4][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = 0;
        int cal = 0;

        for (int i = 0; i < arr.length; i++) {
            cal -= arr[i][0];
            cal += arr[i][1];

            if (cal> max) {
                max = cal;
            }
        }

        System.out.println(max);
    }
}