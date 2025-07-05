public class A005 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            String s2 = s.replaceAll("[^"+skill+"]", "");  // skill에 있는 알파벳 제외 제거
            if(skill.startsWith(s2)) answer++;
        }

        return answer;
    }
}
