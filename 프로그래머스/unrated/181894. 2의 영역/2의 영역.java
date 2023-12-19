import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer;
        int firstIdx = -1;
        int lastIdx = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                firstIdx = i;
                break;
            }
        }
        
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] == 2){
                lastIdx = i;
                break;
            }
        }
        
        if((firstIdx==lastIdx) && (firstIdx!=-1)){
            answer = new int[1];
            answer[0] = arr[firstIdx];
        }else if((firstIdx==-1) && (lastIdx==-1)){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[lastIdx-firstIdx+1];
            for(int i=firstIdx,j=0; i<=lastIdx; i++,j++){
                answer[j] = arr[i];
            }
        }
        
        return answer;
    }
}