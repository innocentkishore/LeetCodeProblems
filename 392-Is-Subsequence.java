class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
       int i=0;
       int j=0;
       if(s.length()<1) return true;
        while(i<t.length()){
            if(sc[j]==tc[i]){
               j++;
            }
           i++;
        
        if(s.length()==j) return true;
        }

        return false;
    }
}