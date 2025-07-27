package week4;

import java.util.Scanner;

public class A051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        sc.close();

        int totalTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            totalTime += getDialTime(c);
        }

        System.out.println(totalTime);
    }

    private static int getDialTime(char c) {
        if ("ABC".indexOf(c) >= 0) return 3;
        if ("DEF".indexOf(c) >= 0) return 4;
        if ("GHI".indexOf(c) >= 0) return 5;
        if ("JKL".indexOf(c) >= 0) return 6;
        if ("MNO".indexOf(c) >= 0) return 7;
        if ("PQRS".indexOf(c) >= 0) return 8;
        if ("TUV".indexOf(c) >= 0) return 9;
        if ("WXYZ".indexOf(c) >= 0) return 10;
        return 0;
    }

}



