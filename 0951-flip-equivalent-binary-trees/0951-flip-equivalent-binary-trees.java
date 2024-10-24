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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base cases: if both nodes are null, return true
        if (root1 == null && root2 == null) return true;
        // If only one of the nodes is null or values are not equal, return false
        if (root1 == null || root2 == null || root1.val != root2.val) return false;
        
        // Recursively check if children are flip equivalent in both flipped and non-flipped cases
        boolean noFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        
        return noFlip || flip;
    }
}