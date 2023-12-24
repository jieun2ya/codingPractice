class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        
        for(int i=0; i<=myString.length()-len; i++){
            String str = myString.substring(i,i+len);
            if(str.equals(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}