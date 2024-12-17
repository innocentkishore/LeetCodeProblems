/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int max=0;
        int ht=0;
        for(Node n:root.children){
            max=maxDepth(n);
            ht=Math.max(max,ht);
        }
        ht+=1;
        
        return ht;
        
    }
}