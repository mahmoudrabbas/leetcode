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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }else if(root.left == null && root.right == null){
            return true;
        }else if(root.left != null && root.right != null){
            return isSameTree(root.right, root.left);
        }else {
            return false;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p!=null && q!=null){
            if(p.val == q.val){
                return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}