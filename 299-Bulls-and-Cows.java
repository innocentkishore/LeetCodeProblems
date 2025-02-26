class Solution {
    public String getHint(String secret, String guess) {
      
        ArrayList<Integer> list=new ArrayList<>();
        int c=0;
         int b=0;
        int []f=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
        b++;
            }
            else{
                if(f[secret.charAt(i)-'0']<0) c++;
                if(f[guess.charAt(i)-'0']>0) c++;
                f[secret.charAt(i)-'0']++;
                f[guess.charAt(i)-'0']--;
            }
        }
       
return b+\A\+c+\B\;
    }
}