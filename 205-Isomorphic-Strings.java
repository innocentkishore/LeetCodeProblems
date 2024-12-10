class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map=new HashMap<>();
         HashMap<Character,Boolean> val=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i))
                return false;
            }
            else{
                if(val.getOrDefault(t.charAt(i),false))
                return false;

            map.put(s.charAt(i),t.charAt(i));
            val.put(t.charAt(i),true);

            }
        }
        System.out.print(map);
        return true;
    }
}