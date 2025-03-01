class Solution {
    public void rotate(int[][] matrix) {
        int [][]res=new int[matrix.length][matrix[0].length];
        int k=0;
        int a=0;
        int row=matrix.length-1;
        int col=0;
      for(int i=0;i<matrix.length;i++){
       
            for(int j=0;j<matrix[0].length;j++){

                res[i][j]=matrix[row--][col];
            }
            row=matrix.length-1;
            col++;
        }
        
    
         for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=res[i][j];

            }
        }
        
    }
}