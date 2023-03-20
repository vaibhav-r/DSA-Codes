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
    public void flatten(TreeNode root) {
        flattenHelper(root, null);
    }

    private TreeNode flattenHelper(TreeNode root, TreeNode prev) {
        if (root == null) {
            return prev;
        }

        prev = flattenHelper(root.right, prev);
        prev = flattenHelper(root.left, prev);
        root.right = prev;
        root.left = null;
        prev = root;
        return prev;
    }
}
