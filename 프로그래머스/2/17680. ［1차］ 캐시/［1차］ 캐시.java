import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) {
    	    return cities.length * 5;
        }
        int answer = cacheSize*5;
        List<String> list = new ArrayList<String>();

        // 캐시크기만큼 list에 값 넣어두기, 중복값은 빼고
        for(int i=0; i<cacheSize; i++) {
            if(list.contains(cities[i].toLowerCase())) {
    		 answer-=4;
    	 }else{
    		 list.add(cities[i].toLowerCase());
    	 }
        }

        for(int i=cacheSize; i<cities.length; i++) {
                // list에 해당도시 포함되어 있으면 +1 아니면 +5 하나씩 밀어내기
                if(list.contains(cities[i].toLowerCase())) {
                     answer += 1;
                     list.remove(cities[i].toLowerCase());
                 }else {
                     answer += 5;
                     list.remove(0);
                 }
                 list.add(cities[i].toLowerCase());
        }
        
        return answer;
    }
}
/*
11,16,19,20
3 ["a", "b", "c", "a"] 16
3 ["a", "b", "c", "a", "b"] 17
3 ["a", "b", "c", "a", "b", "d", "c"] 27
*/
