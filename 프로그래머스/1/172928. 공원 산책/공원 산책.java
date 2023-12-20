import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int[][] EWSN = {{0,1}, {0,-1}, {1,0}, {-1,0}};	// 동서남북
        int[][] start = new int[1][2];	// 시작지점
        List<int[]> way = new ArrayList<>();	// 이동거리
        int maxW = park[0].length()-1;
        int maxH = park.length-1;
        
        // 이동거리 세팅
         for(int i=0; i<routes.length; i++) {
        	int[][] newEWSN = new int[4][2];
        	String[] str = routes[i].split(" ");
        	if(str[0].equals("E")) {	
        		newEWSN[0][1] = EWSN[0][1] + (Integer.parseInt(str[1])-1);
        		way.add(newEWSN[0]);
        	}else if(str[0].equals("W")) {
        		newEWSN[1][1] = EWSN[1][1] * (Integer.parseInt(str[1]));
        		way.add(newEWSN[1]);
        	}else if(str[0].equals("S")) {
        		newEWSN[2][0] = EWSN[2][0] + (Integer.parseInt(str[1])-1);
        		way.add(newEWSN[2]);
        	}else if(str[0].equals("N")) {
        		newEWSN[3][0] = EWSN[3][0] * (Integer.parseInt(str[1]));
        		way.add(newEWSN[3]);
        	}
        }
        
        // 시작지점 세팅
        for(int j=0; j<park.length; j++) {
            for(int k=0; k<park[j].length(); k++) {
            	String str = park[j].charAt(k) + "";
                if(str.equals("S")) {
                    start[0][0] = j;
                    start[0][1] = k;
                }
            }
        }
        
        for(int i=0; i<way.size(); i++) {
        	
        	int w = start[0][1] + way.get(i)[1];
        	int h = start[0][0] + way.get(i)[0];
        		
        	if(0<=w && maxW>=w && 0<=h && maxH>=h) {
        		if(checkX(w,h,start[0][0],start[0][1], park)) {
        			start[0][0] = h;
        			start[0][1] = w;
        		}
        	}
        }
        
        int[] answer = new int[2];
        answer[0] = start[0][0];
        answer[1] = start[0][1];

        return answer;
    }

// 요부분 수정해야함. w or h 가 e or s 보다 적을경우....추가해야함...
    public boolean checkX (int w,int h, int e, int s,String[] park) {
	boolean result = true;
	for(int i=e; i<=h; i++) {
		for(int j=s; j<=w; j++) {
			String str = park[i].charAt(j) + "";
			if(str.equals("X")) {
				result = false;
				break;
			}
		}
		
	}
	return result;
}
}
