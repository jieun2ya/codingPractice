class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0, right = 0;
        int check = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                left++;
                check++;
            }else{
                right++;
                check--;
            }
            
            if(check < 0){
                answer = false;
            }
            
        }
        
        if(left != right){
            answer = false;
        }

        
        

        return answer;
    }
}
