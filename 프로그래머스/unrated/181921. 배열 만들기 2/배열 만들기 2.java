import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> arrayList = new ArrayList<>();
        for(int i=l; i<r+1; i++){
            String str = i + "";
            
            for(int j=0; j<str.length(); j++){
                String checkStr = str.charAt(j) + "";
                // 0이나 5가 아닐시 for문 나가
                if(!(checkStr.equals("5") || checkStr.equals("0"))){
                	break;
                }
                if(j == str.length()-1) {
                	arrayList.add(i);
                }
                
            }
        }
        
        if(arrayList.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arrayList.size()];
            for(int i=0; i< arrayList.size(); i++){
                answer[i] = arrayList.get(i);
            }
            
        }
        
        
        return answer;
    }
}