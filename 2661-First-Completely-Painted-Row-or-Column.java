class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int min=Integer.MAX_VALUE;                                
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++){
            int max=-1;
            for(int j=0;j<col;j++){
                max=Math.max(max,map.get(mat[i][j]));
            }
            min=Math.min(max,min);
        }
          for(int i=0;i<col;i++){
            int max=-1;
            for(int j=0;j<row;j++){
                max=Math.max(max,map.get(mat[j][i]));
            }
            min=Math.min(max,min);
        }
        return min;
    }
}