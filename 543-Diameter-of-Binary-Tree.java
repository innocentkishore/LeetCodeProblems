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
    public int[] d=new int[1];
    public int diameterOfBinary(TreeNode root){
         if(root==null) return 0;

        int left=diameterOfBinary(root.left);
        
        int right=diameterOfBinary(root.right);
        d[0]=Math.max(d[0],left+right);
        return Math.max(left,right)+1;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
       diameterOfBinary(root);
       return d[0];
        
    }
}