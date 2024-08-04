class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
int mod = 1_000_000_007;

        // A min-heap to store subarray sums
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Compute all subarray sums and add them to the min-heap
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                minHeap.add(currentSum);
            }
        }
        
        // Remove the first (left-1) elements from the min-heap
        for (int i = 1; i < left; i++) {
            minHeap.poll();
        }
        
        // Sum the elements from index left to right
        long result = 0;
        for (int i = left; i <= right; i++) {
            result = (result + minHeap.poll()) % mod;
        }
        
        return (int) result;
    }
}