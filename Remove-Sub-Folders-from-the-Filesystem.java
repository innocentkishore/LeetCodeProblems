class Solution {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String> list=new ArrayList<>();
        // for(String s:folder){
        //     list.add(s);
        // }
        Arrays.sort(folder);
        for(String s:folder){
            if(list.isEmpty()|| !s.startsWith(list.get(list.size()-1)+"/")){
                list.add(s);
            }
        }
        return list;
    }
}