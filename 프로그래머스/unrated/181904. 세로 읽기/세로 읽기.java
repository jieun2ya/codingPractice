class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] arr = new String[my_string.length()/m];
        
        for(int i=0; i<arr.length; i++) {
			arr[i] = my_string.substring(m*i,m*(i+1));
			answer += arr[i].charAt(c-1) + "";
		}
        
        return answer;
    }
}