class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int []left=new int[n];
        int []right=new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                left[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();

         for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                right[i]=s.peek();
            }
            s.push(i);
        }
        int mod=(int)1e9 +7;
        long answer=0;
        for(int i=0;i<n;++i){
            answer+=(long)(i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            answer%=mod;
        }
        return (int)answer;
        
    }
}