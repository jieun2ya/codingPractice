import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        
        List<String> list1;
		List<String> list2;
		if(str1.length() < str2.length()) {
			list1 = getList(str1.toUpperCase());
			list2 = getList(str2.toUpperCase());
		}else {
			list1 = getList(str2.toUpperCase());
			list2 = getList(str1.toUpperCase());
		}
        
		Set<String> set = new HashSet<String>();
		for(String str: list1) {
			set.add(str);
		}
		for(String str: list2) {
			set.add(str);
		}
		
		double gyo = 0;
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j))) {
					gyo++;
					list2.set(j, "1");
                    break;
				}
			}
		}
        double sum = list1.size()+list2.size() - gyo; 
        double answer = 0;
		
		if(list1.size() == 0)
			answer = 1;	// 공집합일 경우 1
		else
			answer = (double) gyo / (double) sum;
        
		return (int) (answer * 65536);
    }
    
    public List<String> getList(String str) {
		List<String> list = new ArrayList<>();
		for(int i = 0; i < str.length()-1; i++) {
			if(Pattern.matches("^[A-Z]*$", str.charAt(i)+"") && Pattern.matches("^[A-Z]*$", str.charAt(i+1)+"")) {
				list.add((str.charAt(i)+"")+(str.charAt(i+1)+""));
			}
		}
		return list;
	}
}