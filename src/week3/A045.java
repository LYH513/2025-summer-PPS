package week3;
import java.util.Scanner;

public class A045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = s.toLowerCase();
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int max = 0;
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                maxCount++;
            }
        }

        if(maxCount>1) {
            System.out.println("?");
        }else {
            System.out.println((char) ('A' + index));
        }

    }
}


