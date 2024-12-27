class Solution {

    public int find(int [][]grid,int sc,int sr,int dr,int dc){
        if(sr==dr&&sc==dc) return 1;
        if(sr>dr|| sc>dc) return 0;
        if(grid[sr][sc]!=0) return grid[sr][sc];
        int r=find(grid,sc+1,sr,dr,dc);
        int d=find(grid,sc,sr+1,dr,dc);
        grid[sr][sc]=r+d;
        return r+d;
       
    }
    public int uniquePaths(int m, int n) {

        int [][]grid=new int[m][n];

      return  find(grid,0,0,m-1,n-1);
        
        
    }
}