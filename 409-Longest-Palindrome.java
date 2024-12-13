class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int sum=0;
        boolean hasodd=false;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i:map.values()){
            if(i%2==0){
                sum+=i;
            }else{
                sum+=i-1;
                hasodd=true;
            }
        }
        if(hasodd){
            sum+=1;
        }

        return sum;
        
    }
}