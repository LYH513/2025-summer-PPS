package week3;

public class A062 {
        public String solution(int a, int b) {
            String[] arr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};

            int total = 0;
            for(int i=0; i< a-1; i++){
                total += days[i];
            }
            total += b;

            int index = (5+total-1) % 7;
            return arr[index];
        }
}
