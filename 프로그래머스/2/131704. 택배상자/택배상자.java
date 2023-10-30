import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        int[] container = {5,4,3,2,1};
        Stack<Integer> containerSub = new Stack<>();
        int originArr[] = order.clone();
        Arrays.sort(order);

        
        //기사님이 원하는 상자 배열의 순서를 가리키는 변수
        int target = 0;
        
        for(int i = 0; i < originArr.length; i++){
            //원하는 상자가 벨트에서 나오는 상자와 같으면
            if(order[i]==originArr[target]){
            	// 상자싣고order, 다음 원하는 상자 찾기위해 ++
                answer++;
                target++;
                
                //sub에 원하는 상자가 있는지 찾기위해 sub size()만큼 반복문 돌리기
                int subSize = containerSub.size();
                for(int j = 0; j < subSize; j++){
                    //sub가 비어있지 않고 맨 앞에 있는 상자가 원하는 상자면 꺼내서 싣고, 다음원하는 상자 찾기위해++
                    if(!containerSub.isEmpty() && containerSub.peek()==originArr[target]){
                        answer++;
                        target++;
                        containerSub.pop();
                    }
                }
            }else{	// 원하는 상자가 벨트에서 나오는상자와 다르면 sub에 넣기
            	containerSub.push(order[i]);
            }
        }
        return answer;
    }
}