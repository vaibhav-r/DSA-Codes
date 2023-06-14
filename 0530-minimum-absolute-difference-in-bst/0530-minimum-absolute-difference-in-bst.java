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
    int minDif=Integer.MAX_VALUE;
    TreeNode prev;
    public void inOrder(TreeNode node){
        if(node==null) return;
        inOrder(node.left);
        if(prev!=null){
            minDif=Math.min(minDif,node.val-prev.val);
        }
        prev=node;
        inOrder(node.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDif;
    }
}