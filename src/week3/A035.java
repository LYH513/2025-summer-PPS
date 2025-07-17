package week3;

import java.util.Scanner;

public class A035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());

        double arr[] = new double[T];

        for (int i = 0; i < T; i++) {
            String line = scanner.nextLine().trim();
            String[] tokens = line.split("\\s+");

            double num = Double.parseDouble(tokens[0]);

            for (int j = 1; j < tokens.length; j++) {
                char c = tokens[j].charAt(0);
                if (c == '@') {
                    num *= 3;
                } else if (c == '%') {
                    num += 5;
                } else if (c == '#') {
                    num -= 7;
                }
            }

            arr[i] = num;
        }

        for (int i = 0; i < T; i++) {
            System.out.printf("%.2f\n", arr[i]);
        }

    }
}
