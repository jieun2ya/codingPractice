import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        // 조건충족된것 넣어 놓을 list
        List<int[]> check = new ArrayList<>();
        // ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]
        String[] str = {"code","date","maximum","remain"};
        // 조건에 해당하는 idx,sortIdx 세팅
        int idx = 0, sortIdx = 0;
        for(int i=0; i<4; i++){
            if(str[i].equals(ext)){
                idx = i;
            }
            
            if(str[i].equals(sort_by)){
                sortIdx = i;
            }
        }
        
        
        //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후
        for(int i=0; i<data.length; i++){
            if(data[i][idx] < val_ext){
                check.add(data[i]);
            }
        }
        
        final int si = sortIdx;
        // sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        Collections.sort(check,(o1,o2)->o1[si]-o2[si]);
        
        // 위에 정렬순서대로 값 넣어서 답 return
        int[][] answer = new int[check.size()][4];
        for(int i=0; i<check.size(); i++){
            answer[i] = check.get(i);
        }
        
        return answer;
    }
    
}