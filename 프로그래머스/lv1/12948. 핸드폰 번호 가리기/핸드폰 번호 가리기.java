class Solution {
    public String solution(String phone_number) {
        // 뒷번호 4개 제외한 숫자 자르기(*처리할 숫자들)
        String frontNum = phone_number.substring(0, phone_number.length()-4);
        // 치환할 *문자 생성
        String changeChar = "*".repeat(frontNum.length());
        // 위에서 자른숫자 *로 변경
        String answer = phone_number.replaceAll(frontNum,changeChar);
        return answer;
    }
}