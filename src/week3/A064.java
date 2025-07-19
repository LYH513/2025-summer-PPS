package week3;

import java.util.Arrays;

public class A064 {
    public int heightChecker(int[] heights) {
        int [] arr = heights.clone();
        Arrays.sort(arr);

        int count =0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != arr[i]){
                count++;
            }
        }

        return count;
    }
}
