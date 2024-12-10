class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap map=new HashMap<>();
        
        String[] str=s.split(" ");
        if(str.length!=p.length()){
            return false;
        }
        for(Integer i=0;i<str.length;i++){
            if(map.put(p.charAt(i),i)!=map.put(str[i],i))
            return false;
        }
        return true;
    }
}