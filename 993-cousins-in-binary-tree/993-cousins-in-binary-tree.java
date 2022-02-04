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
    TreeNode parentX;
    TreeNode parentY;
    int xDepth;
    int yDepth;
    public boolean isCousins(TreeNode root, int x, int y) {
        // if (root == null) return false;
        dfs (root, x, y, 0, null);
        return xDepth == yDepth && parentX != parentY;
    }
    public void dfs(TreeNode root, int x, int y, int depth, TreeNode parent) {
        //base
        if (root == null) return;
        
        //logic
        if (root.val == x) {
            parentX = parent; xDepth = depth;
        }
        if (root.val == y) {
            parentY = parent; yDepth = depth;
        }
        dfs(root.left, x, y, depth+1, root);
        dfs(root.right, x, y, depth+1, root);
    }
}