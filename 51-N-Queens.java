class Solution {
     public static void  backtrack(int col,char[][] board,int[] left,int[] updiagonal,int[] downdiagonal,int n,List<List<String>> result ){
        if(col==n){
            List<String> list=new ArrayList<>();
            // System.out.println(\N Queen\);
            for(int i=0;i<n;i++){
                list.add(new String(board[i]));
            }
          result.add(new ArrayList<>(list)) ;
          return;

        }
        for(int row=0;row<n;row++){
            if(left[row]==0&&updiagonal[n-1+col-row]==0&&downdiagonal[row+col]==0){
                board[row][col]='Q';
                left[row]=1;
                updiagonal[n-1+col-row]=1;
                downdiagonal[row+col]=1;
                backtrack(col+1, board, left, updiagonal, downdiagonal, n,result);
                board[row][col]='.';
                left[row]=0;
                updiagonal[n-1+col-row]=0;
                downdiagonal[row+col]=0;

            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
         char [][]board=new char[n][n];
        int []left=new int[n];
         List<List<String>> result = new ArrayList<>();

        int []updiagonal=new int[2*n-1];
        int []downdiagonal=new int[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
           
        }
        backtrack(0,board,left,updiagonal,downdiagonal,n,result);
        return result;
        
    }
}