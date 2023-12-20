class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        
        for(int i=0; i<section.length; i++){
            if (section[i] > idx) {
                answer++;
                // 현재 인덱스 부터 칠한 마지막 칸 인덱스
                idx = section[i] + m - 1; 
            }
        }
        
        return answer;
    }
}