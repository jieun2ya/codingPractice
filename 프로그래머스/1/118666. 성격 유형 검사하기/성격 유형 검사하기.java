import static java.lang.Math.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        int R = 0;
        int T = 0;
        int C = 0;
        int F = 0;
        int J = 0;
        int M = 0;
        int A = 0;
        int N = 0;
        
        for(int i=0; i < survey.length;i++){
            
            int tmpNum = 0;
            String tmpStr = "";
            
            if (choices[i] < 4){
                tmpStr = survey[i].substring(0,1);
            } else {
              tmpStr = survey[i].substring(1,2);  
            }
            
            tmpNum = Math.abs(choices[i]-4);
            
            switch(tmpStr) {
                case "R" : R += tmpNum; break;
                case "T" : T += tmpNum; break;
                case "C" : C += tmpNum; break;
                case "F" : F += tmpNum; break;
                case "J" : J += tmpNum; break;
                case "M" : M += tmpNum; break;
                case "A" : A += tmpNum; break;
                case "N" : N += tmpNum; break;
            } 
        }
        
        String answer = "";
        
        if (R >= T) {answer += "R";}
        else {answer += "T";}
        
        if (C >= F) {answer += "C";}
        else {answer += "F";}
        
        if (J >= M) {answer += "J";}
        else {answer += "M";}
        
        if (A >= N) {answer += "A";}
        else {answer += "N";}
        
        return answer;
    }
}