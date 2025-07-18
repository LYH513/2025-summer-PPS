package week3;
import java.util.*;

public class A041 {
    public String solution(String s) {
        String answer = "";

        String[] words = s.split("\\s+");

        for(String word : words){
            if(Character.isDigit(word.charAt(0))){
                answer += word+' ';
            } else {
                String result = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase();
                answer += result+ ' ';
            }
        }

        return answer.substring(0,answer.length()-1);
    }
}
