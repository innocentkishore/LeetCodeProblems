class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String>  s=new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char r=board[i][j];
                if(r!='.'){
                if(!s.add(\c\+j+r)||!s.add(\r\+i+r)|| !s.add(\grd\+r+i/3+j/3)){
                    return false;
                }
                }
            }
        }
        return true;
    }
}