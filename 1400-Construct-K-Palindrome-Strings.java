class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
int sum=0;
        int []freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        //  for(int i=0;i<26;i++){
        //      System.out.println(freq[i]);
        //     }
         
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                
              sum++;
                
                }
            }
        return (sum>k)? false:true;
    }
}