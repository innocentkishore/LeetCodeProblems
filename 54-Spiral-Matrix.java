class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> list=new ArrayList<>();
        
        int n=mat.length;
        int m=mat[0].length;
    int top=0;
    int bottom=n-1;
    int left=0;
    int right=m-1;
    
    while(top<=bottom && left<=right){
    for(int i=left;i<=right;i++){
        list.add(mat[top][i]);
    }
    top++;
    for(int i=top;i<=bottom;i++){
        list.add(mat[i][right]);
    }
    right--;
    if(top<=bottom){
    for(int i=right;i>=left;i--){
        list.add(mat[bottom][i]);
    }
    bottom--;
    }
    
    if(left<=right){
    for(int i=bottom;i>=top;i--){
        list.add(mat[i][left]);
    }
    left++;
    }
    
        
    }
    return list;
        
    }
}