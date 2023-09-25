import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n- lost.length;
        
        List<Integer> lList = new ArrayList<>();
    	for(int i : lost) lList.add(i);
    	
    	List<Integer> rList = new ArrayList<>();
    	for(int i : reserve) rList.add(i);
    	
    	for (int i = 0; i < lList.size(); i++) {
			for (int j = 0; j < rList.size(); j++) {
				if(lList.get(i) == rList.get(j)) {
					lList.remove(i); rList.remove(j);
					n++; i--;
					break;
				}
			}
		}
    	
    	for (int i = 0; i < lList.size(); i++) {
			for (int j = 0; j < rList.size(); j++) {
				if(Math.abs(lList.get(i) - rList.get(j)) == 1) {
					n++; rList.remove(j);
					break;
				}
			}
		}

        
        return answer;
    }
    
    
}