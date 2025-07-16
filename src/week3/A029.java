package week3;
import java.util.*;

public class A029 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = scanner.nextInt();

        int two = first == 0 ? 1 : 0;
        int third = two == 0 ? 1 : 0;

        boolean check = false;
        int arr[] = new int[n-1];

        int temp = -1;
        int prev = first;
        for (int i = 1; i < n; i++) {
            if ((i+1) % 2 == 0) {
                temp = two;
            } else if ((i+1) % 3 == 0) {
                temp = third;
            } else {
                temp = prev == 0 ? 1 : 0;
            }

            if((i+1)%6 ==0){
                if (arr[i+1] != arr[0] || arr[i+1] != arr[1]) {
                    check = true;
                    break;
                }
            }

            arr[i - 1] = temp;

            if(temp == prev) {
                check = true;
                break;
            }

            prev = temp;

        }

        if(check) {
            System.out.println("Love is open door");
        } else {
            for (int i = 0; i < n-1; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
