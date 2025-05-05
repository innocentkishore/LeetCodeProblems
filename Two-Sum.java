class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=nums.length;
        int[] b=new int[2];
        int i,j;
        for( i=0;i<a;i++){
            for( j=i+1;j<a;j++){
            if(nums[i]+nums[j]==target){
               b[0]=i;
               b[1]=j;
                return b;
            }

        }
        }
        return b;
        }
    }    
    
