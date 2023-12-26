import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";        
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int cnt = 1;
            while (cnt <= index){
                c++;
                // z 넘어가면 a로 돌아가야함
                if (c > 'z'){
                    c = (char)((int)c-26);
                }
                
                // skip에 포함되어있는지 확인
                if (skip.contains(c+"")){
                    continue;
                }else {
                    cnt ++;
                }
                
            }
            answer += c;
        }
        
        return answer;
    }
}