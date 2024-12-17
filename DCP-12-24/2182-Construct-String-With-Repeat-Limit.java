class Solution {
    public String repeatLimitedString(String str, int repeatLimit) {
        // boolean allzero=true;
        int[] freq=new int [26];
          StringBuffer s=new StringBuffer();
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
            
        }
        int i=25;
        int j=25;
        int f=0;
        
        while(i>=0){
            
             if(freq[i]==0){
                i--;
                if(f!=1)
                j--;
             }
             else if(f==1){
                s.append((char)(i+'a'));
                freq[i]--;
                i=j;
                f=0;
             }
             else{
                int c=0;
                while(freq[i]>0 && c<repeatLimit){
                    s.append((char)(i+'a'));
                    c++;
                    freq[i]--;
                }
                if(freq[i]!=0){
                    f=1;
                }
                i--;
             }
        }
       
        return s.toString();
    }
}