import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        //
        // 공백인 배열 제거
        for (String str : arr) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}