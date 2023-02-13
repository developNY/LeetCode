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
    // Iterative - BFS
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        
        while(!queue.isEmpty()){
            TreeNode ltmp = queue.poll();
            TreeNode rtmp = queue.poll();
            if(ltmp == null && rtmp == null)
                continue;
            else if(ltmp == null || rtmp == null)
                return false;
            else if(ltmp.val != rtmp.val)
                return false;
            queue.add(ltmp.left);
            queue.add(rtmp.right);
            queue.add(ltmp.right);
            queue.add(rtmp.left);
        }
        return true;
    }
    
    // Recursive - DFS
//     public boolean isSame(TreeNode n1, TreeNode n2){
//         if(n1 == null && n2 == null)
//             return true;
//         else if(n1 == null || n2 == null)
//             return false;
//         else if(n1.val != n2.val)
//             return false;
//         return isSame(n1.left, n2.right) && isSame(n1.right, n2.left);
//     }
    
//     public boolean isSymmetric(TreeNode root) {
//         return isSame(root.left, root.right);
//     }
}