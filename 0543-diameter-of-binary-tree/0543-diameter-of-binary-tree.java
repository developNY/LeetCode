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
    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxLen(root);
        return diameter;
    }

    public int maxLen(TreeNode node){
        if(node == null)
            return 0;
        int maxL = maxLen(node.left);
        int maxR = maxLen(node.right);
        this.diameter = Math.max(this.diameter, maxL+maxR);
        return Math.max(maxL, maxR)+1;
    }
}