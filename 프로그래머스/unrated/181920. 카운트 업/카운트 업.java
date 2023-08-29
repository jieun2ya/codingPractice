class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        
        int num = start_num;
        for(int i = 0; i <answer.length; i++){
            answer[i] = num++;
        }
        
        return answer;
    }
}