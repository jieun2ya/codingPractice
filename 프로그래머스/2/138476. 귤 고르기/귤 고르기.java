import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = k;
		
		Map<Integer, Integer> map = new HashMap<>();
				
		for(int i: tangerine) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
        // map value값으로 정렬
		List<Integer> keySetList = new ArrayList<>(map.keySet());
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		for (int key : keySetList) {
			if(k > 0) {
				k = k-map.get(key);
				answer++;
			}
		}
        
        return answer;
    }
}