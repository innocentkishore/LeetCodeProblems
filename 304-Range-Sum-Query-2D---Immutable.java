class NumMatrix {
    private int [][]matsum;
    private int r,c;
    public NumMatrix(int[][] matrix) {
        r=matrix.length;
        c=matrix[0].length;
        matsum=new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                matsum[i][j]=matsum[i-1][j]+matsum[i][j-1]-matsum[i-1][j-1]+matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matsum[row2 + 1][col2 + 1] - matsum[row1][col2 + 1] - matsum[row2 + 1][col1] + matsum[row1][col1];
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */