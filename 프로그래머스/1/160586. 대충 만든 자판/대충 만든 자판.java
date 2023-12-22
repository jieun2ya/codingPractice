class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++){
            int count = 0;
            for(int j=0; j<targets[i].length(); j++){
                String s = String.valueOf(targets[i].charAt(j));
                int num = 101;
                
                for(int k=0; k<keymap.length; k++){
                    if(keymap[k].indexOf(s)!=-1 && keymap[k].indexOf(s)<num){
                        num = keymap[k].indexOf(s);
                    }
                }

                if(num < 101){
                    count += num+1;
                }else{
                    count = 0;
                    break;
                }
            }
            
            if(count != 0){
                answer[i] = count;
            }else{
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}