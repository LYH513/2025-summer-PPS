package week4;

import java.util.Scanner;

public class A049 {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals("end")) break;

            String str = "";
            char prev = ' ';
            int flag = 0;
            int vowelCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (prev == s.charAt(i)) {
                    if (s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                        flag++;
                        break;
                    }
                }

                if (isVowel(s.charAt(i))) {
                    str += 1 + "";
                    vowelCount++;
                } else {
                    str += 0 + "";
                }
                prev = s.charAt(i);

            }

            if (vowelCount == 0 || flag == 1 || str.contains("000") || str.contains("111")) {
                System.out.println("<" + s + "> is not acceptable.");
            } else {
                System.out.println("<" + s + "> is acceptable.");
            }
        }
    }
}
