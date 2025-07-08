package week1;

public class A010 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        if(s.length()==1) return 1;

        for (int i=1; i<= s.length()/2; i++){
            String pattern = s.substring(0, i);
            int count = 1;
            String reStr = "";

            for(int j=i; j <=s.length()-i; j+=i){ // i개의 pattern이니까 i개씩 건너뛰면서 일치여부 확인
                if(pattern.equals(s.substring(j, j+i))){
                    count ++;
                } else { // 글자합치기
                    if (count >1){
                        reStr += count+"";
                    }
                    reStr += pattern;

                    //초기화
                    pattern = s.substring(j, j+i);
                    count =1;
                }
            }

            //나머지 계산
            if (count>1){
                reStr += ""+count;
            }
            reStr += pattern;

            //길이가 가장 작은 값 찾기
            int div = s.length()% i;
            answer = Math.min(answer, reStr.length()+div);

        }

        return answer;
    }
}