class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i < included.length-1; i++){
            if(included[i]){
                answer += a + (d*i)
            }
        }
        return answer;
    }
}