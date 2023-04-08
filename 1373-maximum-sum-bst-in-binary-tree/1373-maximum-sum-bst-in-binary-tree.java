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
    private int maxSum = 0;

    public int maxSumBST(TreeNode root) {
        traverse(root);
        return maxSum;
    }

    private int[] traverse(TreeNode root) {
        if (root == null) {
            // Return an array representing an empty BST
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }

        int[] left = traverse(root.left);
        int[] right = traverse(root.right);

        // Check if the current subtree is a valid BST
        if (left[0] == 1 && right[0] == 1 && root.val > left[2] && root.val < right[1]) {
            int sum = root.val + left[3] + right[3];
            maxSum = Math.max(maxSum, sum);
            return new int[]{1, Math.min(left[1], root.val), Math.max(right[2], root.val), sum};
        } else {
            // Return an array representing an empty BST
            return new int[]{0, 0, 0, 0};
        }
    }
}
