import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        // 맨 처음 글자는 비교할게 없기 때문에 -1
        answer[0] = -1;

        for(int i=1; i<s.length(); i++){
            int x = s.lastIndexOf(s.substring(i, i+1), i-1);

            if(x != -1){
                answer[i] = i-x;
            }else{
                answer[i] = x;
            }
        }

            return answer;
    }
}