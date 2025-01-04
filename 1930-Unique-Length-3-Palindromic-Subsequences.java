class Solution {
    public int countPalindromicSubsequence(String s) {
       int[]f=new int[26];
       int c=0;
       for(int i=s.length()-1;i>=0;i--){
        if(f[s.charAt(i)-'a']==0)
        f[s.charAt(i)-'a']=i;
       }
       //System.out.print(f[0]);
       for(int i=0;i<s.length()-1;i++){
        int lastidx=f[s.charAt(i)-'a'];
        if(lastidx<0|| i==lastidx||i+1==lastidx) continue;
        
        f[s.charAt(i)-'a']=-1;
        int []count=new int[26];
        for(int j=i+1;j<lastidx;j++){
            count[s.charAt(j)-'a']++;
            if(count[s.charAt(j)-'a']==1 ){
                c++;
            }
        }
       }
       return c;

    }
}  