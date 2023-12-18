class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        
        for(int i=start,j=0; i>=end_num; i--,j++){
            answer[j] = i;
        }
        return answer;
    }
}