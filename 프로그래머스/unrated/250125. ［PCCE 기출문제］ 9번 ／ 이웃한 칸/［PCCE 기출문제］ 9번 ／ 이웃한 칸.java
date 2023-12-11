class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        // 상하좌우
        int[][] dhw = {{0,-1},{0,1},{-1,0},{1,0}};
        
        for(int i=0; i<4; i++){
            int h_check = h +dhw[i][0];
            int w_check = w +dhw[i][1];
    
            if(0<=h_check && n>h_check && 0<=w_check && n>w_check){
                // 문자열 비교시 == 안됨
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}