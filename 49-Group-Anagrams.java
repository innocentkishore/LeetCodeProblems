class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
         int j=0;
         char [] ch1=strs[i].toCharArray();
         Arrays.sort(ch1);
         String keystr=String.valueOf(ch1);
         if(!map.containsKey(keystr)) map.put(keystr,new ArrayList<>());
         map.get(keystr).add(strs[i]);
        
        

         }
        
return new ArrayList<>(map.values());
        }
        
    }
