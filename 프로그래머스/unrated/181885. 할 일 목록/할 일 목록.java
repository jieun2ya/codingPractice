import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}