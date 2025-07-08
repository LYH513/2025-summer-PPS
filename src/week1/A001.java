package week1;

import java.util.ArrayList;
import java.util.List;

public class A001 {
        public int findContentChildren(int[] g, int[] s) {
            List<Integer> list = new ArrayList<>();
            int answer = 0;

            for(int i=0; i< s.length; i++){
                list.add(s[i]);
            }

            for(int i=0; i< g.length; i++){
                if(list.contains(g[i])){
                    System.out.println(g[i]);
                    answer++;
                    list.remove(Integer.valueOf(g[i]));
                }
            }

            return answer;
        }

}
