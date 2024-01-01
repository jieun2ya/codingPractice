import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]"," ");
        String[] answer = myStr.trim().split("\\s+");
        
        if(answer.length==1 && answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        
        
        return answer;
    }
}