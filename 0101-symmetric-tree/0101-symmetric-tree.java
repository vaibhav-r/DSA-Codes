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
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricUnit(root.left,root.right);
    }
    public boolean isSymmetricUnit(TreeNode left,TreeNode right){
        if(right==null || left==null) return right==left;
        return right.val==left.val && isSymmetricUnit(left.left,right.right)&& isSymmetricUnit(left.right,right.left);
    }
}