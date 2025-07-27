package week4;
import  java.util.*;

public class A135 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String title = sc.nextLine();
                map.put(title, map.getOrDefault(title, 0) + 1);
            }

            String result = "";
            int max = 0;

            for (String key : map.keySet()) {
                int count = map.get(key);
                if (count > max) {
                    max = count;
                    result = key;
                } else if (count == max && key.compareTo(result) < 0) {
                    result = key;
                }
            }

            System.out.println(result);
        }

}
