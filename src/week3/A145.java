package week3;

public class A145 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        int total = 0;
        for(int i=1; i<=count; i++){
            total += price *i;
        }
        answer = total - money;
        return answer;
    }
}
