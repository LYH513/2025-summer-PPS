import java.util.*;

public class A018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int arr[] = new int[10];

        int sum = A*B*C;

        while (sum>0){
            int digit = sum % 10;
            arr[digit]++;
            sum = sum / 10;
        }

        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}