class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++) {
            // 영어대문자 65~90
            if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) {
                answer[my_string.charAt(i)-65]++;
            // 영어소문자 97~122
            } else if(my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
                answer[my_string.charAt(i)-71]++;
            }

        }
        return answer;
    }
}