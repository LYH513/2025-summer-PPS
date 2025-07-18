package week3;

public class A043 {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        String prefix = strs[0];

        for(int i=0; i< strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;

    }
}
