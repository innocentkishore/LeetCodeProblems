class Solution {
    public int countServers(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int []c=new int[col];
        int []r=new int[row];
        int a=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                   r[i]+=1;
                   c[j]+=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1&& (r[i]>1||c[j]>1)){
                    a++;
                   
                }
            }
        }
       return a;
    }
}