import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for(int i=1; i<=n/k; i++){
            answer[i-1] = k*i;
        }
        
        return answer;
    }
}