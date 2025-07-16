package week2;

import java.math.BigInteger;
import java.util.*;

public class A028 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        System.out.println(A.add(B));
    }
}