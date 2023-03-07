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

//Recursive Code:
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res,0);
        return res; 
    }
    public void helper(TreeNode curr, List<Integer> res, int val){
        if(curr!=null){
            if(val==res.size()){
                res.add(curr.val);
            }
            helper(curr.right,res,val+1);
            helper(curr.left,res,val+1);
        }
    }
}