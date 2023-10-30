import java.util.*;

class Solution {
    public int solution(int[] order) {
      int answer = 0;
        Stack<Integer> containerSub = new Stack<>();
        
        int originArr[] = order.clone();
        
        Arrays.sort(order);
        int target = 0;
        
        for(int i = 0; i < originArr.length; i++){

            if(order[i]==originArr[target]){
                answer++;
                target++;

                int suppBeltSize = containerSub.size();
                for(int j = 0; j < suppBeltSize; j++){

                    if(!containerSub.isEmpty() && containerSub.peek()==originArr[target]){
                        answer++;
                        target++;
                        containerSub.pop();
                    }
                }
            }else{
            	containerSub.push(order[i]);
            }
        }
        return answer;
    }
}