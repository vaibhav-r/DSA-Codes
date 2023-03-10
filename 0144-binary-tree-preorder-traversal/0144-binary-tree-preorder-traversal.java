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
// Recursive Method:
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root,List<Integer> res){
        if(root!=null){
            res.add(root.val);
            helper(root.left,res);
            helper(root.right,res);
        }
    }
}

// OR

// Iterative Method:
// class  Solution{
//     public List<Integer> preorderTraversal(TreeNode root){
//         List<Integer> ans=new ArrayList<>();
//         Stack<TreeNode> st=new Stack<>();
//         st.add(root);
//         while(!st.isEmpty()){
//             TreeNode curr=st.peek();
//             st.pop();
//             if(curr!=null){
//                 ans.add(curr.val);
//                 st.add(curr.right);
//                 st.add(curr.left);
//             }
//         }
//         return ans;
//     }
// }