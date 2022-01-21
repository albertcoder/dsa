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
    class Pair {
        TreeNode node;
        int val = 0;
        public Pair(TreeNode node, int val) {
            this.node = node;
            this.val = val;
        }
    }
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int result = 0; int sum = 0;
        Stack<Pair> st = new Stack<>();
        while(root != null || !st.isEmpty()){
            while(root != null) {
                sum = sum * 10 + root.val;
                st.push(new Pair(root, sum));
                root = root.left;
            }
            Pair p = st.pop();
            root = p.node;
            sum = p.val;
            if (root.left == null && root.right == null) {
                result += sum;
            }
            System.out.println(root.val);
            root = root.right;
        }
        return result;
    }
}