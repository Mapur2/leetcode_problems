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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode e=new TreeNode(val,null,null);
        TreeNode t,p=null;
        if(root==null)
            return e;
        t=root;
        while(t!=null)
        {
            p=t;
            //System.out.println(p.val);
            if(t.val>val)
                t=t.left;
            else
                t=t.right;
        }
        if(p.val>val)
            p.left=e;
        else
            p.right=e;
        return root;
    }
}