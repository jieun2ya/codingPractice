class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int widthMax = 0;
        int heightMax = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            
            if (sizes[i][0] > widthMax){
                widthMax = sizes[i][0];
            }
            
            if (sizes[i][1] > heightMax){
                heightMax = sizes[i][1];
            }
        }
        
        
        return widthMax * heightMax;
    }
}