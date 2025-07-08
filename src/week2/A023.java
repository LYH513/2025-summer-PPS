package week2;

public class A023 {
    public int addDigits(int num) {
        int result = 0;
        int sum = num;

        while(sum>0){
            String src = Integer.toString(sum);
            int arr[] = new int[src.length()];

            if(src.length() == 1){
                result = sum;
                break;
            }

            for(int i=0; i<src.length(); i++){
                int digit = sum % 10 ;
                arr[i] = digit;
                sum = sum / 10;
            }

            sum =0;
            for(int i=0; i< arr.length; i++){
                sum+= arr[i];
            }
        }

        return result;
    }
}
