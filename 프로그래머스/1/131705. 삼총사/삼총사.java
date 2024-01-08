class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int a=0; a<number.length-2; a++){
          for(int s=a+1; s<number.length-1; s++){
              for(int d=s+1; d<number.length; d++){
                  if(number[a] + number[s] + number[d] == 0) {
                      answer++;
                  }
              }
          }
        }
        
        return answer;
    }
}