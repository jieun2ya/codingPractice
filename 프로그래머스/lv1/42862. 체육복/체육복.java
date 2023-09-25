import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n- lost.length;
        
        // 여벌 있지만 도둑맞아서 못빌려줌
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			answer++;
        			lost[i] = reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        // 여벌없고 도둑맞음
        for(int lostN : lost) {
        	for(int i = 0; i<reserve.length; i++) {
        		if(reserve[i] == lostN-1 || reserve[i] == lostN+1) {
        			answer++;
        			reserve[i] = -1;
        			break;
        		}
        	}
        }

        
        return answer;
    }
    
    
}
