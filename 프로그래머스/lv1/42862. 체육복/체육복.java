import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        for(int i = 0; i < lost.length; i++) {
			if(Arrays.asList(reserve).contains(lost[i])) {
				continue;
			}
			
			for(int j: reserve) {
				if(j == lost[i]-1 || j == lost[i]+1) {
					answer++;
				}
			}
			
		}
		
		if(answer > n) {
			answer = n;
		}
        
        return answer;
    }
    
    
}