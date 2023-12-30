import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // trim으로 앞뒤 공백 제거
        // "\s+"는 하나 이상의 공백을 의미
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }
}