package week4;
import java.util.Scanner;

public class A050 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String ans = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            char decoded = (char) (ch - 3);
            if (decoded < 'A') {
                decoded += 26;
            }
            ans += decoded;
        }

        System.out.println(ans);

    }
}

