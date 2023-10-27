class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1_000_000_007; 
        Arrays.sort(arr);
        long[] dp = new long[arr.length];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            index.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int complement = arr[i] / arr[j];
                    if (index.containsKey(complement)) {
                        dp[i] = (dp[i] + dp[j] * dp[index.get(complement)]) % MOD;
                    }
                }
            }
        }

        long total = 0;
        for (long numTrees : dp) {
            total = (total + numTrees) % MOD;
        }

        return (int) total;
    }

}