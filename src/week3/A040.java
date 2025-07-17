package week3;

public class A040 {
    public boolean halvesAreAlike(String s) {
        boolean isAlike = true;
        int leftCount =0;
        int rightCount =0;

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if(i< s.length()/2){
                if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ||
                        c =='A' || c =='E' || c =='I' || c =='O' || c =='U'
                ){
                    leftCount++;
                }
            } else {
                if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ||
                        c =='A' || c =='E' || c =='I' || c =='O' || c =='U'
                ){
                    rightCount++;
                }
            }
        }

        return leftCount == rightCount;
    }
}
