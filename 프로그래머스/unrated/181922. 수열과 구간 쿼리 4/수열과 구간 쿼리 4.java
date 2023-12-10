class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        // 이번엔 index가 k 배수인지 확인하는것;;;
        for(int i=0; i<queries.length; i++){
            // 숫자값이 아닌 index값
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<e+1; j++){
                if(j%k == 0){
                    arr[j] += 1;
                }
            }            
            
        }
        return answer;
    }
}