import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++) {
        	map.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++) {
        	int num = map.get(callings[i]);
        	String temp = players[num];

        	players[num] = players[num-1];
        	players[num-1] = temp;
        	// 다시 세팅
        	map.put(temp, num-1);
        	map.put(players[num], num);
        }
        
        return players;
    }
}