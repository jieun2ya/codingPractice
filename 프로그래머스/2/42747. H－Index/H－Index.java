import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        //list에 넣고
        List<Integer> list = new ArrayList<>();
        for(int i : citations){
            list.add(i);
        }
        //오름차순 정렬
        Collections.sort(list);
    
        for(int i = 0; i < list.size(); i++){
            
            int count = list.size() - i;

            //논문 수가 논문 인용 수보다 더 작아지기 시작하는 전의 값이 h-index
            if (list.get(i) >= count) {
                answer = count;
                break;
            }
            
        }
        return answer;
    }
}