import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> list = new ArrayList<>(Arrays.asList(str_list));
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l") && str_list.length > 1){
                list = list.subList(0,i);
                break;
            }else if(str_list[i].equals("r") && str_list.length > 1){
                list = list.subList(i+1,list.size());
                break;
            }
        }
        
        
        
        
        if(list.size() > 1){
            answer = list.toArray(new String[0]);
        }
        
        return answer;
    }
}