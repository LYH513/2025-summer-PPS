package week3;

import java.util.Stack;

public class A042 {
    public boolean backspaceCompare(String s, String t) {
        boolean isSame = false;

        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(int i=0; i< s.length(); i++){
            if(s.charAt(i) == '#' && !sStack.isEmpty()){
                sStack.pop();
            } else {
                sStack.push(s.charAt(i));
            }
        }

        for(int i=0; i< t.length(); i++){
            if(t.charAt(i) == '#' && !tStack.isEmpty()){
                tStack.pop();
            } else {
                tStack.push(t.charAt(i));
            }
        }

        isSame = sStack.equals(tStack);

        return isSame;
    }
}
