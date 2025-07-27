package week6;
import java.util.*;
public class A201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean inTag = false;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '<') {
                // 태그 시작 전 단어 뒤집기
                result.append(word.reverse());
                word.setLength(0);

                inTag = true;
                result.append(c);
            } else if (c == '>') {
                inTag = false;
                result.append(c);
            } else if (inTag) {
                // 태그 내부는 그대로 출력
                result.append(c);
            } else {
                // 태그 밖, 단어 뒤집기
                if (c == ' ') {
                    result.append(word.reverse());
                    word.setLength(0);
                    result.append(c);
                } else {
                    word.append(c);
                }
            }
        }
        // 마지막 단어 뒤집기
        result.append(word.reverse());

        System.out.println(result.toString());
    }

}
