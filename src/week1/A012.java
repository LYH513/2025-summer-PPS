package week1;

public class A012 {
    public int countPrimes(int n) {

        int count = 0;
        for (int i=0; i<n; i++){
            if (isPrime(i)){
                System.out.println(i);
                count++;
            }
        }

        return count;

    }

    private boolean isPrime(int n){
        if (n ==0 || n==1) {
            return false;
        }
        if (n ==2 || n==3) {
            return true;
        }
        if (n % 2 == 0 || n%3 ==0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (i % n == 0) {
                return false;
            }
        }

        return true;
    }
}

