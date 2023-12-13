import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(stkList.size() == 0){
                stkList.add(arr[i]);
                continue;
            }else if(stkList.get(stkList.size()-1) < arr[i]){
                stkList.add(arr[i]);
                continue;
            }
            
            if(stkList.size() != 0){
        		if(stkList.get(stkList.size()-1) >= arr[i]){
                    stkList.remove(stkList.size()-1);
                    i--;
                }
        	}
            
        }
        
        int[] stk = new int[stkList.size()];
        for(int i=0; i<stkList.size(); i++){
            stk[i] = stkList.get(i);
        }
        
        return stk;
    }
}
