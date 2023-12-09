class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        
        for(int i=0; i< my_string.length(); i++) {
        	str += my_string.charAt(i);
        	if(str.equals(is_prefix)) {
        		answer = 1;
        		break;
        	}
        }
        return answer;
    }
}