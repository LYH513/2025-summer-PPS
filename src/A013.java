import java.util.Arrays;

public class A013 {
    public int singleNumber(int[] nums) {
        int arr[] = new int[nums.length+1];
        for(int i=0; i< nums.length;i++){
            arr[nums[i]]++;
        }

        System.out.println(Arrays.toString(arr));

        int answer = -1;
        for(int i=0; i <= nums.length; i++){
            if(arr[i]==1){
                answer = i;
            }
        }

        return answer;
    }
}