class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(find(i,j,0,board,word))
                return true;
            }
        }
        return false;
        
    }
    public boolean find(int row,int col,int idx,char [][]board,String word){
        if(idx==word.length()){
            return true;
        }
        if(row<0|| col>=board[0].length|| col<0||row>=board.length||board[row][col]!=word.charAt(idx)){
            return false;
        }
        char ch=board[row][col];
        board[row][col]='.';
        boolean found=find(row-1,col,idx+1,board,word)||
        find(row,col+1,idx+1,board,word)||
        find(row+1,col,idx+1,board,word)||
        find(row,col-1,idx+1,board,word);
         board[row][col]=ch;
return found;
    }
}