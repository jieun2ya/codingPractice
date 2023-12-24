class Solution {
    public String solution(String myString, String pat) {
        
        // lastIndexOd(str) str에 해당하는 idx번호 반환 뒤에서부터 처음나오는것, indexOf는 앞에서부터 찾음
        int idx = myString.lastIndexOf(pat);
        String answer = myString.substring(0,idx+pat.length());
        
        return answer;
    }
}