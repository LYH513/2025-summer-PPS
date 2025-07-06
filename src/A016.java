import java.util.*;

public class A016 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(people);

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<people.length; i++){
            list.add(people[i]);
        }


        for(int i=0;i<people.length-1; i++){
            sum += people[i];
            if(sum+people[i+1]>limit){
                answer++;
                int index = list.indexOf(people[i+1]);
                list.subList(0, index).clear();
                sum = 0;
            }
        }

        if (list.size()>0){
            answer ++;
        }

        return answer;
    }
}