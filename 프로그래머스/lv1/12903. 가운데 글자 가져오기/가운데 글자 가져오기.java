class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 한개씩 넣은 배열로 반환
        String arr[] = s.split("");
        // 문자 길이 구하기
        int len = s.length();
        // 중간숫자 찾기 위한 인덱스 숫자 넣어놓기
        int i = (int) len / 2;
        
        if(len % 2 == 0){
            answer = arr[i-1];
            answer += arr[i];
        }else{
            answer += arr[i];
        }
        
        return answer;
        
        
    }
}