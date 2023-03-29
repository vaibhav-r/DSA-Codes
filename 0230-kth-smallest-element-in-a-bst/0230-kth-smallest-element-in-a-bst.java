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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) {
            return -1; // or any other appropriate error value
        }
        
        int count = countNodes(root.left);
        
        if(k <= count) {
            return kthSmallest(root.left, k);
        } else if(k > count + 1) {
            return kthSmallest(root.right, k - count - 1);
        }
        
        return root.val;
    }
    
    private int countNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
