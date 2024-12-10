class Solution {
    class Node{
        boolean eof=false;
        Node[] children=new Node[26];

    }
    public String longestWord(String[] words) {
       Node root=new Node();
        for(String s:words){
             Node node=root;
             for(char ch:s.toCharArray()){
                if(node.children[ch-'a']==null){
                    node.children[ch-'a']=new Node();

                }
                node=node.children[ch-'a'];
             }
            node.eof=true;
        }
       
        helper(root,new StringBuilder());
        return res;
        
    }
      String res="";

    public void helper(Node node,StringBuilder str){
        if(str.length()>res.length()){
            res=str.toString();
        }
        for(char ch='a';ch<='z';ch++){
            Node child=node.children[ch-'a'];
            if(child!=null && child.eof==true){
                str.append(ch);
                helper(child,str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }
}