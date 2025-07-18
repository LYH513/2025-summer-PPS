package week3;

public class A044 {
    public boolean checkRecord(String s) {
        int abscentCount = 0;

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == 'A'){
                abscentCount++;
            }
        }

        if(abscentCount>1 || s.contains("LLL")){
            return false;
        } else {
            return true;
        }
    }
}