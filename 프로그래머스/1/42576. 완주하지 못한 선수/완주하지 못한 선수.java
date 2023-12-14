import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 두 배열이 다를 경우 찾기
        int i = 0;
        for(i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }
        return participant[i];
    }
    
}