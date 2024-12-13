class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int rs=0;
        int rt=0;
        for(char c:s.toCharArray()){
            rs+=(int)c;
        }
         for(char c:t.toCharArray()){
            rt+=(int)c;
        }
        return (char)(rt-rs);
    }
}