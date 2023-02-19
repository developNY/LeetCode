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

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return dfs(root, null, null);
    }

    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if (
            (min != null && root.val <= min) || max != null && root.val >= max
        ) {
            return false;
        }

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
    }
}
// class Solution {
//     public boolean isValid(TreeNode root, int min, int max){
//         if(root == null)
//             return true;
//         if(root.val <= min || root.val >= max)
//             return false;
//         return isValid(root.left, min, Math.min(max, root.val)) && isValid(root.right, Math.max(min, root.val), max);
//     }
    
//     public boolean isValidBST(TreeNode root) {
//         if(root.left == null && root.right == null)
//                 return true;
//         return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
//     }
// }