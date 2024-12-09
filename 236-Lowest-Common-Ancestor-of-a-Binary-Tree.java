/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   public  List<TreeNode> list=new ArrayList<>();
    public boolean roottonode(TreeNode root,TreeNode node){
        if(root ==null){
            return false;
        }
        if(root.val==node.val){
            list.add(root);
            return true;
        }
        boolean left=roottonode(root.left,node);
        if(left){
            list.add(root);
            return true;
        }
        boolean right=roottonode(root.right,node);
        if(right){
            list.add(root);
            return true;
        }
        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        list=new ArrayList<>();
        boolean flag1=roottonode(root,p);
        List<TreeNode> plist=new ArrayList<>(list);

        list=new ArrayList<>();
        boolean flag2=roottonode(root,q);
        List<TreeNode> qlist=new ArrayList<>(list);
        int i=plist.size()-1;
        int j=qlist.size()-1;
        TreeNode lca=null;
        while(i>=0&&j>=0){
            
            if(plist.get(i).val==list.get(j).val){
                
               lca=plist.get(i);
                     i--;
                j--;
                
               
            }
            else{
               break;
            }
        }

        return lca;
    }
}