class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x");
        
        int[] answer;
        if(myString.charAt(myString.length()-1) == 'x'){
            answer = new int[split.length+1];
            answer[split.length] = 0;
        }else{
            answer = new int[split.length];
        }
            
        
        for(int i=0; i<split.length; i++){
            answer[i] = split[i].length();
        }
        
        return answer;
    }
}