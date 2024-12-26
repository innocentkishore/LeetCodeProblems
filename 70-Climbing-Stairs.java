class Solution {
    public int find(int n,int[] memo){
        if(n==0) return 1;
        if(n<0) return 0;

        if(memo[n]!=0) return memo[n];
        
        int l=find(n-1,memo);
        int r=find(n-2,memo);
        memo[n]=l+r;
        return l+r;
    }
    public int climbStairs(int n) {
        int []meo=new int[n+1];
       return find(n,meo);
        
    }
}