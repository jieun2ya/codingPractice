class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numArr = num_str.split("");
        
        for(String num: numArr){
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}