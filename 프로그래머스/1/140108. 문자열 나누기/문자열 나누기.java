class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        char front = s.charAt(0);
        int same = 0;
        int diff = 0;
        for(int i = 0 ; i < size ; i++){
            char ch = s.charAt(i);
            if(front == ch){
                same++;
            }else{
                diff++;
            }

            if(same == diff){
                answer++;
                same = 0;
                diff = 0;
                if(i+1 < size){
                    front = s.charAt(i+1);
                }
            }else if(i == size-1){
                answer++;
            }
        }
        return answer;
    }
}