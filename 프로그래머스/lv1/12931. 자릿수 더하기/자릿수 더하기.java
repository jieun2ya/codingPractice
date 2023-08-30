import java.util.*;

public class Solution {
    public int solution(int n) {
        String len = n + "";
        int answer = 0;
        int j = 10;
        
		for(int i =0; i < len.length(); i++) {
			if(i != 0) {
				answer += (n % j) / (j/10);
				j *= 10;
			}else {
				answer += n % j;
				j *= 10;
			}
		}

        return answer;
    }
}