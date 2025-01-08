class Solution {
    public int maxVowels(String s, int k) {
       
        int c=0;
        int max=0;
        String str="aeiou";
        int l=0;
        char []ch=s.toCharArray();
       

        for(int i=0;i<ch.length;i++){
            if(str.contains(String.valueOf(ch[i]))){
                c++;
            }
            if(i>=k && str.contains(String.valueOf(ch[i-k]))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}