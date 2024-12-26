class Solution {
    public int find(int[] nums,int[]dp,int n){
        if(n==0) return nums[0];
        if(n<0) return 0;
        if(dp[n]>-1)  return dp[n];
        int la=find(nums,dp,n-2)+nums[n];
        int ra=find(nums,dp,n-1)+0;
        dp[n]=Math.max(la,ra);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
       return find(nums,dp,n-1);
    }
}