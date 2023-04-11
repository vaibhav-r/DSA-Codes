class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for (int num : nums) {
        //     pq.offer(num);
        //     if (pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // return pq.poll();
        
        //OR
        
        Arrays.sort(nums);
        int targetIndex = nums.length - k;
        return nums[targetIndex];
        
    }
}