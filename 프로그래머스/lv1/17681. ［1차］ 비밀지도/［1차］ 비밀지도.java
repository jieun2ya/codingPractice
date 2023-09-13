class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            // 10진수를 2진수로 변환하는 함수 사용, 비트연산자 이용해서 합치기
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 원하는 글자수만큼 지정
            answer[i] = String.format("%"+n+"s",answer[i]);
            answer[i] = answer[i].replaceAll("0", " "); // 0을 공백으로 대체
            answer[i] = answer[i].replaceAll("1", "#"); // 1을 #으로 대체
            
        }
              
        return answer;
    }
}