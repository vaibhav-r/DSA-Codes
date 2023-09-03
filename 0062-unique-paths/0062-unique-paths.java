class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];

        // Initialize the first row and first column to 1 since there's only one way to reach any cell in the first row and first column.
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the dp array using dynamic programming.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The value in the bottom-right corner is the number of unique paths.
        return dp[m - 1][n - 1];
    }
}