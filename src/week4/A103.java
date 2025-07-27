package week4;

import java.util.HashSet;
import java.util.Set;

public class A103 {
    public int uniqueMorseRepresentations(String[] words) {
        // 알파벳 a-z에 대한 모스 부호 배열
        String[] morseCodes = new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                // 알파벳의 모스 부호를 찾아서 붙임
                sb.append(morseCodes[c - 'a']);
            }
            transformations.add(sb.toString());
        }

        return transformations.size();
    }

}