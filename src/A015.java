import java.util.*;

public class A015 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0; i<5; i++){
            arr[i] = scanner.nextInt();
        }

        int sum=0;

        for (int i=0; i<5; i++){
            sum+= arr[i]*arr[i];
        }

        System.out.println(sum%10);
    }
}