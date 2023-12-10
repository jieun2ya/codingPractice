import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        
        while(n!=1){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n+1;
            }
            arrayList.add(n);
        }
        
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i]);
        }
        
        return answer;
    }
}