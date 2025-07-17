package week3;

public class A039 {
    public boolean isPerfectSquare(int num) {

        boolean isPerfectSquare = false;

        for(int i=0; i<num/2; i++){
            if(i*i == num){
                isPerfectSquare = true;
            }
        }

        return isPerfectSquare;
    }
}
