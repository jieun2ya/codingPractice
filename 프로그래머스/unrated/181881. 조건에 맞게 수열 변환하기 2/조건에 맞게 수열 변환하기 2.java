class Solution {
    public int solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = -1;
        boolean check = true;
        
        while(check){
            count++;
            
            for(int i=0; i<arr.length; i++){
                if((arr[i]>=50) && (arr[i]%2==0)){
                    answer[i] = arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    answer[i] = arr[i]*2+1;
                }else{
                    answer[i] = arr[i];
                }
            }
            
            for(int i=0; i<arr.length; i++){
                if(answer[i]!=arr[i]){
                    check = true;
                    break;
                }else{
                    check = false;
                }
            }
            
            if(check){
                for(int i=0; i<answer.length; i++){
                    arr[i] = answer[i];
                }
            }
        }
                
        return count;
    }
}