package week3;
import java.util.Scanner;

public class A046 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }

        int alphArr[] = new int[26];

        for (int i = 0; i <n; i++) {
            alphArr[arr[i].charAt(0) - 'a']++;
        }

        String s = "";

        for (int i = 0; i < 26; i++) {
            if (alphArr[i] > 4) {
                s += (char) (i + 'a');
            }
        }

        if (s.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(s);
        }

    }
}
