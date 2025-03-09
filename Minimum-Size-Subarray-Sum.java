class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int n=nums.length;
        for(int m=0;m<n;m++){
            sum+=nums[m];
        }
        if(sum<target){
            return 0;
        }
        else{
            sum=0;
      while(j<nums.length){
        sum+=nums[j];
        // System.out.println(sum);
        while(sum>=target){
            // System.out.println(\i \+i+\j \+j);
            // System.out.println(\sum\+sum);
            // System.out.println(j-i+1);
            min=Math.min(min,j-i+1);
            sum=sum-nums[i];
            i++;
            // j=i;
            
        }
        j++;
        
      }
        }

        return min;
    }
}