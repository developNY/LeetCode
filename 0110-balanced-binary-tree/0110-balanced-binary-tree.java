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
    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        height(root);
        return this.isBalanced;
    }

    public int height(TreeNode node){
        if(node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        if(Math.abs(left-right) > 1)
            isBalanced = isBalanced & false;
        return Math.max(left, right)+1;
    }
}