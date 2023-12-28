import java.util.*;
import java.text.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        
        
        for(String str: terms){
            String[] arr = str.split(" ");
            map.put(arr[0],Integer.parseInt(arr[1]));
        }
        
        for(int i=0; i<privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            int n = Integer.valueOf(map.get(arr[1]));
            
            System.out.println();
            try {
                Date inputDate = dateFormat.parse(arr[0]);  
                Date todayDate = dateFormat.parse(today);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(inputDate);
                calendar.add(Calendar.MONTH, n);
                Date afterDate = calendar.getTime();

                // 두 날짜를 비교
                int result = todayDate.compareTo(afterDate);
                if (result >= 0) {
                    list.add(i+1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}