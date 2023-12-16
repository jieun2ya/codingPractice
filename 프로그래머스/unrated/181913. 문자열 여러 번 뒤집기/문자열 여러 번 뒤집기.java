class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            String str = "";
            for(int j=queries[i][1]; j>=queries[i][0]; j--){
                str += (my_string.charAt(j) + "");
            }

            String prefix = queries[i][0] != 0 ? my_string.substring(0,queries[i][0]) : "";
            String suffix = queries[i][1] != my_string.length() ? my_string.substring(queries[i][1]+1) : "";

           my_string =  prefix+str+suffix;
        }
        return my_string;
    }
}