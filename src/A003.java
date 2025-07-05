public class A003 {
    public int[] plusOne(int[] digits) {
        String s = "";
        int len = 0;
        int result[];

        if (digits[digits.length-1] == 9){
            result = new int[digits.length+1];
            len = digits.length+1;
        } else {
            result = new int[digits.length];
            len = digits.length;
        }

        for (int i=0; i < digits.length; i++){
            s += digits[i];
        }


        int num = Integer.parseInt(s);
        num = num+1;
        System.out.println(num);
        s = String.valueOf(num);

        for (int i=0; i< len; i++){
            result[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        return result;
    }
}