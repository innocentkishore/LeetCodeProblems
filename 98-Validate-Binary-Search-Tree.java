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
    public boolean check(TreeNode root,Integer max,Integer min)
{
    if(root==null){
        return true;
    }
   if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
    return false;
}
    boolean left=check(root.left,root.val,min);
    boolean right=check(root.right,max,root.val);
    return left&&right;
    
}    public boolean isValidBST(TreeNode root) {
        return check(root,null,null);
    }
}