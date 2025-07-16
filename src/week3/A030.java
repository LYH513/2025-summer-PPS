package week3;

import java.util.*;

public class A030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int currentMood = sc.nextInt();

        double goodToGood = sc.nextDouble();
        double goodToBad = sc.nextDouble();
        double badToGood = sc.nextDouble();
        double badToBad = sc.nextDouble();

        double pGood = (currentMood == 0) ? 1.0 : 0.0;
        double pBad = 1.0 - pGood;

        for (int i = 0; i < N; i++) {
            double nextGood = goodToGood * pGood + badToGood * pBad;
            double nextBad = goodToBad * pGood + badToBad * pBad;

            pGood = nextGood;
            pBad = nextBad;
        }

        System.out.println((int)Math.round(pGood * 1000));
        System.out.println((int)Math.round(pBad * 1000));
    }
}

