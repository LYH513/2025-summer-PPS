package week3;

import java.util.ArrayList;
import java.util.List;

public class A060 {
    public int calPoints(String[] operations) {
        int ans = 0;
        List<String> list = new ArrayList<>();


        for(int i=0; i<operations.length; i++){
            if(operations[i].matches("-?\\d+")){
                list.add(operations[i]);
            } else {
                if(operations[i].equals("+")){
                    int a = Integer.parseInt(list.get(list.size()-1));
                    int b = Integer.parseInt(list.get(list.size()-2));
                    list.add(Integer.toString(a+b));
                } else if(operations[i].equals("D")){
                    int a = Integer.parseInt(list.get(list.size()-1));
                    list.add(Integer.toString(a*2));
                } else if (operations[i].equals("C")){
                    list.remove(list.size()-1);
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            int a = Integer.parseInt(list.get(i));
            ans += a;
        }

        return ans;
    }
}
