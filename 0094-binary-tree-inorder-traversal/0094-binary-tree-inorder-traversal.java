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
//Morris Method:
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>(); 
        
        TreeNode cur = root; 
        while(cur != null) {
            if(cur.left == null) {
                inorder.add(cur.val); 
                cur = cur.right; 
            }
            else {
                TreeNode prev = cur.left; 
                while(prev.right != null && prev.right != cur) {
                    prev = prev.right; 
                }
                
                if(prev.right == null) {
                    prev.right = cur;
                    cur = cur.left; 
                }
                else {
                    prev.right = null; 
                    inorder.add(cur.val); 
                    cur = cur.right; 
                }
            }
        }
        return inorder; 
    }
}
//Recursive Method:
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res=new ArrayList<>();
//         helper(root,res);
//         return res;
//     }
//     public void helper(TreeNode root,List<Integer> res){
//         if(root!=null){
//             helper(root.left,res);
//             res.add(root.val);
//             helper(root.right,res);
//         }
//     }
// }

// OR

//Iterative Method:
// class Solution{
//     public List<Integer> inorderTraversal(TreeNode root){
//         List<Integer> res=new ArrayList<>();
//         Stack<TreeNode> st=new Stack<>();
//         TreeNode curr=root;
//         while(curr!=null || !st.isEmpty()){
//             while(curr!=null){
//                 st.push(curr);
//                 curr=curr.left;
//             }
//             curr=st.pop();
//             res.add(curr.val);
//             curr=curr.right;
//         }
//         return res;
//     }
// }