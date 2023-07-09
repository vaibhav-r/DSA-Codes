class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val; // Add value of the left leaf node
        }

        sum += sumOfLeftLeaves(root.left); // Recursively process left subtree
        sum += sumOfLeftLeaves(root.right); // Recursively process right subtree

        return sum;
    }
}
