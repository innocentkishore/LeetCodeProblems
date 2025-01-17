class Solution {
    public int[] productExceptSelf(int[] arr) {
        int sum=1;
        int a=0;
        // code here
        int []pre=new int[arr.length];
        int []suf=new int[arr.length];
        pre[0]=1;
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]*arr[i-1];
        }
        suf[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            suf[i]=arr[i+1]*suf[i+1];
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=pre[i]*suf[i];
        }
        return arr;
        
    }
}