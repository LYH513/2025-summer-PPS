package week3;

public class A038 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;

        int left =0;
        int right =x;
        double answer =0;

        while(left <= right){
            int mid = left+ (right-left)/2;
            long sq = (long) mid* mid;

            if(sq ==x){
                answer = mid;
                break;
            } else if (sq<x){
                left = mid +1;
                answer= mid;
            } else {
                right = mid-1;
            }
        }


        return (int) answer;
    }
}
