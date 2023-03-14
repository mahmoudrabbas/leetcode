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
    public int sumNumbers(TreeNode root) {
        return sum(root, "");
    }

    public int sum(TreeNode node, String str){
        str+=node.val;
        if(node.right==null && node.left==null){
            return Integer.valueOf(str);
        }else if(node.left==null){
            return sum(node.right, str);
        }else if(node.right==null){
            return sum(node.left, str);
        }else{
            return sum(node.left, str)+sum(node.right, str);
        }
    }
}