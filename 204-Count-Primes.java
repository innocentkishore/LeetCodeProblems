class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        int []dp=new int[n+1];
        Arrays.fill(dp,1);
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i*i<n;i++){
           if(dp[i]==1) {
            for(int j=i*i;j<=n;j+=i){
                dp[j]=0;
            }

            }
            
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(dp[i]==1) c++;
        }
        return c;
    }
}