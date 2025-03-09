class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int start=0;
        int maxlen=0;
        int []freq=new int[26];
        char []ch=s.toCharArray();
        for(int end=0;end<ch.length;end++){
            // int c=;
            max=Math.max(max,++freq[ch[end]-'A']);
            while((end-start+1)-max>k){
                
                freq[ch[start]-'A']--;
                start++;
            }
             maxlen=Math.max(max,end-start+1);
        }
       
    
return maxlen;
    }
}