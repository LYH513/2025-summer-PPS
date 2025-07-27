package week4;

public class A144 {
    class Solution {
        public int solution(String word) {
            char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
            int[] weights = {781, 156, 31, 6, 1};

            int answer = 0;
            for (int i = 0; i < word.length(); i++) {
                int index = 0;
                for (int j = 0; j < alphabet.length; j++) {
                    if (word.charAt(i) == alphabet[j]) {
                        index = j;
                        break;
                    }
                }
                answer += index * weights[i];
            }
            return answer + word.length();
        }
    }
}
