class Solution {
    public int pivotIndex(int[] a) {
        int []p=new int[a.length];
        int []s=new int[a.length];
        p[0]=a[0];
        s[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            p[i]=p[i-1]+a[i];
        }
        for(int i=a.length-2;i>=0;i--){
            s[i]=s[i+1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            if(p[i]==s[i]){
                return i;
            }
        }
        return -1;
        
    }
}