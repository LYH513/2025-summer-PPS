package week3;

import java.util.ArrayList;
import java.util.List;

public class A037 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i<=right; i++){
            boolean isDividing = true;
            int temp = i;
            while (temp>0){
                int digit = temp%10;
                if(digit == 0 || i%digit !=0){
                    isDividing = false;
                    break;
                }
                temp = temp/10;
            }

            if(isDividing){
                list.add(i);
            }
        }

        return list;
    }
}
