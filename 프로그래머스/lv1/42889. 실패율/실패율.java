import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap<>();
        double sPlayer = stages.length;
        
        for(int i = 1; i <= N; i++){
            double fPlayer = 0;
            
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) {
                    fPlayer++;
                }
            }            
            
            if (fPlayer == 0) { // 0은 나눌 수 음슴
                map.put(i, (double) 0);
                continue;
            }
            
            map.put(i, fPlayer / sPlayer);
            sPlayer = sPlayer - fPlayer;
        }
        
         // 실패율 내림차순 정렬
        List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int i = 0;
        for (Integer key : keySetList) {
            i++;
            answer[i - 1] = key;
        }
        
        return answer;
    }
}