/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void path(TreeNode root,List<String> list,String s){
        if(root.left==null &&root.right==null){
            list.add(s+root.val);
            return;
        }
        if(root.left!=null){
        path(root.left,list,s+root.val+\->\);
        }
        if(root.right!=null){
         path(root.right,list,s+root.val+\->\);
        }
        
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();

        path(root,list,\\);
        return list;
        
    }
}