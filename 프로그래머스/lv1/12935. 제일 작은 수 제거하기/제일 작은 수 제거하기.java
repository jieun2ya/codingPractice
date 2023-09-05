class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = 99999;
        
        for(int i: arr){
            if(i < min)  {
                min = i;
            }  
        }
        
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            for(int i=0, k=0; i < arr.length; i++){
                if(arr[i] != min){
                    answer[k] = arr[i];
                    k++;
                }
            }
        }      
        
        return answer;
    }
}