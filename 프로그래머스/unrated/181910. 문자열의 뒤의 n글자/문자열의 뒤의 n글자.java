class Solution {
    public String solution(String my_string, int n) {
        // 전체 길이에서 주어진 정수 값을 빼서 문자열 substring 시작할 숫자 구하기
        int startNum = my_string.length() - n;
        String answer = my_string.substring(startNum);
        
        return answer;
    }
}