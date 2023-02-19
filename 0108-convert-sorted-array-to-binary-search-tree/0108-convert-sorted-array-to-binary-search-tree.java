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
    int[] nums;
    
    public TreeNode preOrderBST(int left, int right){
        if(left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = preOrderBST(left, mid-1);
        root.right = preOrderBST(mid+1, right);
        return root;
    }
    
    public TreeNode postOrderBST(int left, int right){
        if(left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.right = preOrderBST(mid+1, right);
        root.left = preOrderBST(left, mid-1);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        //return preOrderBST(0, nums.length-1);
        return postOrderBST(0, nums.length-1);
    }
}