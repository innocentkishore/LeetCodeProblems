class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2) return s.length();
        int []freq=new int[26];
        
        int sum=0;
        
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>=3){
        //        freq[i]-
        //     }

        // }
int i=0;
        while(i<freq.length){
            if(freq[i]<=2){
                i++;
                
            }
            else{
                freq[i]=freq[i]-2;

            }
        }
        for(int j:freq){
            sum+=j;
        }
        return sum; 
    }
}