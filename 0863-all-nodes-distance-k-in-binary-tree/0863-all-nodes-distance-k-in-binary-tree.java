/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, Integer> distances = new HashMap<>();
        findDistances(root, target, distances);
        dfs(root, target, k, distances.get(root), distances, result);
        return result;
    }

    private int findDistances(TreeNode node, TreeNode target, Map<TreeNode, Integer> distances) {
        if (node == null) return -1;
        if (node == target) {
            distances.put(node, 0);
            return 0;
        }
        int left = findDistances(node.left, target, distances);
        if (left >= 0) {
            distances.put(node, left + 1);
            return left + 1;
        }
        int right = findDistances(node.right, target, distances);
        if (right >= 0) {
            distances.put(node, right + 1);
            return right + 1;
        }
        return -1;
    }

    private void dfs(TreeNode node, TreeNode target, int k, int distance, Map<TreeNode, Integer> distances, List<Integer> result) {
        if (node == null) return;
        if (distances.containsKey(node)) distance = distances.get(node);
        if (distance == k) result.add(node.val);
        dfs(node.left, target, k, distance + 1, distances, result);
        dfs(node.right, target, k, distance + 1, distances, result);
    }
}