class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int num = 0; num < (1 << n); num++) {
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                // Check if the ith bit is set or not
                if ((num & (1 << i)) != 0) {
                    sub.add(nums[i]);
                }
            }
            ans.add(sub);
        }
        return ans;
    }
}