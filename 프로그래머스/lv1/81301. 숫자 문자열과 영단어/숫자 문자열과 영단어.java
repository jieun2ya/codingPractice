class Solution {
    public int solution(String s) {
        int answer = 0;
        // 숫자 영단어 순서대로 배열에 담아놓기
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // 0~9까지 돌면서 해당 영단어 숫자로 변경
        for(int i=0;i<10;i++){
            s=s.replace(num[i],Integer.toString(i));    //string이라 string으로 변경해서 넣어주기
        }
        // 문자열 정수로 변환하여 넣기
        answer = Integer.parseInt(s);
        return answer;
    }
}