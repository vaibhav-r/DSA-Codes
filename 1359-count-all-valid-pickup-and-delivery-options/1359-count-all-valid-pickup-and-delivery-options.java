class Solution {
    public int countOrders(int n) {
        int MOD = 1000000007;
        long ans = 1;
        
        for (int i = 2; i <= n; i++) {
        // Calculate the number of ways to insert the pickup and delivery for the current order.
        // There are 2 * i - 1 positions to insert them: between each existing pair and at the ends.
            long numWays = (2 * i - 1) * i;
            
            // Multiply the number of ways with the accumulated result.
            ans = (ans * numWays) % MOD;
        }
        
        return (int) ans;
    }
}