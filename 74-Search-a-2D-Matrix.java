class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      int low=0;
      int high=(n*m)-1;
      int mid=0;
      
      int midele=0;
      while(low<=high){
        mid=(low+high)/2;
        midele=matrix[mid/m][mid%m];
        if(midele==target){
          return true;
        }
        else if(target>midele){
            low=mid+1;
        }
        else if(target<midele){
            high=mid-1;
        }
        
      }
return false;
    }
}