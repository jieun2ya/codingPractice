class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = 1000000;
            for(int j=s; j<e+1; j++){
                if((arr[j]>k) && (arr[j]<min)){
                    min = arr[j];
                }
            }
            
            // 위에서 구한 조건에 해당하는 값 arr배열에서는 값빼주고, answer값에 넣어주기
            if(min != 1000000){
                answer[i] = min;
                min = 1000000;
            }else{  // 초기세팅과 동일하면 조건에 만족하는 값이 없다는것
                answer[i] = -1;
            }
            
            
        }
        return answer;
    }
}