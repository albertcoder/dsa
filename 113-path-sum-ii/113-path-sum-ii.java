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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, new ArrayList<>(), 0, targetSum);
        return result;
    }
    public void dfs(TreeNode root, List<Integer> path, int sum, int tSum) {
        //base
        if (root == null) return;
        
        //logic
        path.add(root.val);
        sum = sum + root.val;
        if (root.left == null && root.right == null) {
            if(sum == tSum) {
                result.add(path);
                return;
            }
        }
        
        dfs(root.left, new ArrayList<>(path), sum, tSum);
        dfs(root.right, new ArrayList<>(path), sum, tSum);
    }
}