package week1;

import java.util.ArrayList;
import java.util.List;

public class A014 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (i<nums.length){
            int start = nums[i];
            int end = start;

            while(i+1 <nums.length && nums[i]+1 ==nums[i+1]){
                i++;
                end = nums[i];
            }

            if (start == end){
                list.add(start+"");
            } else {
                list.add(start+"->"+end);
            }

            i++;
        }

        return list;
    }
}