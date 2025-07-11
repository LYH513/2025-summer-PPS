package week2;

public class A026 {
        public boolean solution(int x) {
            boolean answer = true;

            int original = x;
            int sum = 0;

            while(original>0){
                int digit = original%10;
                sum+=digit;
                original = original/10;
            }

            if( x%sum ==0 ){
                answer = true;
            } else {
                answer = false;
            }


            return answer;
        }

}
