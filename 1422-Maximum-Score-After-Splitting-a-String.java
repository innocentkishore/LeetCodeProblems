class Solution {
    public int maxScore(String s) {
        int oc=0;
        int z=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') oc++;
            else{
                z++;
            }
            if(i!=s.length()-1) max=Math.max(z-oc,max);
        }
        return max+oc;
      
    }
}