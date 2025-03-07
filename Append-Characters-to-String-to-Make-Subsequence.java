class Solution {
    public int appendCharacters(String s, String t) {
        int left=0;
        int right=0;
        char []ns=s.toCharArray();
        char []nt=t.toCharArray();
        int tot=nt.length;
        while(right<nt.length&&left<ns.length){
            if(ns[left]==nt[right]){
                tot-=1;
                left++;
                right++;
            }
            else{
                left++;
            }
        }
        return tot;
    }
}