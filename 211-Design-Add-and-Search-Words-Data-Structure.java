class WordDictionary {
class Node{
    boolean eof=false;
    Node children[]=new Node[26];
}
Node root;
    public WordDictionary() {
        root=new Node();
        
    }
    
    public void addWord(String word) {
        Node node=root;
        for(char c:word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']=new Node();
            }
            node=node.children[c-'a'];

        }
        node.eof=true;
        
    }
    public boolean helper(String word,int idx,Node node){
        if(idx==word.length()){
            return node.eof;
        }
        char ch=word.charAt(idx);
        if(ch!='.'){
            Node child=node.children[ch-'a'];
            if(child==null){
                return false;
            }
            else{
                return helper(word,idx+1,child);
            }
        }
        else{
            for(char nx='a';nx<='z';nx++){
                 Node child=node.children[nx-'a'];
            if(child!=null){
            
                 if(helper(word,idx+1,child)){
                    return true;
                 } 
                         }


            }
        }
        return false;
    }
    public boolean search(String word) {
        return helper(word,0,root);
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */