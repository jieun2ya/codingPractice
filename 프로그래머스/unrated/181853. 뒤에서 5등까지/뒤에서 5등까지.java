import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 작은수 5개 담을 거니까 size:5로 배열 미리 생성
        int[] answer = new int[5];
        // 오름차순으로 정렬
        Arrays.sort(num_list);
        // 오름차순으로 정렬한것 5개 담기
        for(int j=0; j<5; j++){
            answer[j] = num_list[j];
        }
        
        return answer;
    }
}