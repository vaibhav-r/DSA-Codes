class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]); // Sort by ending values
        
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Initialize with 1 since each pair can be its own chain
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[j][1] < pairs[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // Update the longest chain length
                }
            }
        }
        
        int maxLength = 0;
        for (int len : dp) {
            maxLength = Math.max(maxLength, len);
        }
        
        return maxLength;
    }
}
