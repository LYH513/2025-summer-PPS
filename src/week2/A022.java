package week2;

import java.util.*;

public class A022 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = 0;
        int y = 0;

        for(int i=0; i<n; i++) {
            y += ((arr[i] / 30) + 1) * 10;
            m += ((arr[i] / 60) + 1) * 15;
        }

        if(m<y){
            System.out.println("M "+m);
        } else if (m>y){
            System.out.println("Y "+y);
        } else {
            System.out.println("Y M "+y);
        }
    }
}