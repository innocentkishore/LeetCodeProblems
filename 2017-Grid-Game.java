class Solution {
    public long gridGame(int[][] grid) {
        long top=0;
        long bottom=0;
        long min=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            top+=grid[0][i];
        }
        // System.out.print(top);
        for(int i=0;i<grid[0].length;i++){
            top-=grid[0][i];
            min=Math.min(min,Math.max(top,bottom));
            bottom+=grid[1][i];
        }
        return min;
    }
}