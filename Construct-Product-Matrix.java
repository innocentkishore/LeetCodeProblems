class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int [][]pre=new int[row][col];
        int [][]suf=new int[row][col];
        int [][]res=new int[row][col];
        int mod=12345;
        int product=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                pre[i][j]=product;
                product=((product%mod)*(grid[i][j]%mod))%mod;
            }
        }
        product =1;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                  suf[i][j]=product;
                product=((product%mod)*(grid[i][j]%mod))%mod;
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=((pre[i][j])*(suf[i][j]))%mod;
            }
        }
        return res;
    }
}