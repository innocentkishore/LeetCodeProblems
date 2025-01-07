class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].length()>words[j].length()){
                    int f=words[i].indexOf(words[j]);
                    if(f!=-1){
                        if(list.contains(words[j])==true){
                            continue;
                        }
                        list.add(words[j]);
                        // break;
                    }
                }
            }
        }
        return list;
    }
}