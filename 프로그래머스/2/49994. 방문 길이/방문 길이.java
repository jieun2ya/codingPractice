import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x=0, y=0;
   
        ArrayList<String> list = new ArrayList<>();
        
        for(int i =0; i<dirs.length(); i++) {
        	char c = dirs.charAt(i);
        	int nextX = x;
        	int nextY = y;
        	if(c == 'U') 
        		nextY++;
        	else if(c == 'D')
        		nextY--;
        	else if(c == 'L')
        		nextX--;
        	else if(c == 'R')
        		nextX++;
            
            
    /*
    R(오른쪽으로 이동) 로 (0,0) → (1,0) 로 이동하는 경우에는 다시 이 길을 선택할 수 없도록 
    (0,0) → (1,0) 경우와 (1,0) →  (0,0) 모두 체크 
    따라서 list에 "0 0 1 0" 과 "1 0 0 0" 을 넣음.
    */
        	
        	if(-5<=nextX && nextX <= 5 && -5 <= nextY && nextY <= 5) {
                //toString()은 null값을 형변환 하면 널포인트가 발생
        		String str1 = String.valueOf(x+" "+y+" "+nextX+" "+nextY);
        		String str2 = String.valueOf(nextX+" "+nextY+" "+x+" "+y);
        		x = nextX;
        		y = nextY;
        		
        		if(!list.contains(str1) && !list.contains(str2)) {
        			list.add(str1);
        			list.add(str2);
        			answer++;	
        		}
        	}
        }
        return answer;
    }
}