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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        if(root==null){
            return res;
        }
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null ){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null ){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().val);
            }
            res.add(new ArrayList<>(list));
            list.clear();
        }
        return res;
    }
}