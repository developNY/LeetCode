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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return depth(root);
    }

    public int depth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(depth(root.left)+1, depth(root.right)+1);
    }

    // DFS
    // if(root == null)
    //         return 0;

    //     int depth = 1;
    //     Stack<TreeNode> nodes = new Stack<>();
    //     Stack<Integer> depths = new Stack<>();
    //     nodes.add(root);
    //     depths.add(depth);

    //     while(!nodes.isEmpty()){
    //         TreeNode tmp = nodes.pop();
    //         int d = depths.pop();
    //         depth = Math.max(depth, d);

    //         if(tmp.left != null){
    //             nodes.add(tmp.left);
    //             depths.add(d+1);
    //         }
    //         if(tmp.right!= null){
    //             nodes.add(tmp.right);
    //             depths.add(d+1);
    //         }
    //     }
    //     return depth;

    // BFS - Queue
    // public int maxDepth(TreeNode root) {
    //     if(root == null)
    //         return 0;
            
    //     int depth = 0;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root);

    //     while(!queue.isEmpty()){
    //         int size = queue.size();
    //         for(int i=0; i<size; i++){
    //             TreeNode tmp = queue.poll();
    //             if(tmp.left != null)
    //                 queue.add(tmp.left);
    //             if(tmp.right != null)
    //                 queue.add(tmp.right);
    //         }
    //         depth++;
    //     }
    //     return depth;
    // }
}