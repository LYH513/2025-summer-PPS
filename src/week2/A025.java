package week2;

public class A025 {
    public boolean isPowerOfFour(int n) {
        boolean result = false;
        int sum = 4;
        if(n ==1) {
            return true;
        }

        while (n>=sum){
            if(n == sum){
                result = true;
                break;
            }

            sum *=4;
        }

        return result;
    }
}
