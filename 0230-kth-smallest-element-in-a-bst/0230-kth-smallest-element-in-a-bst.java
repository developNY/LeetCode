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
    List<Integer> list = new ArrayList<>();
    
    public void addElement(TreeNode root){
        if(root == null)
            return;
        if(root.left != null)
            addElement(root.left);
        list.add(root.val);
        if(root.right != null)
            addElement(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        addElement(root);
        return list.get(k-1);
    }
}