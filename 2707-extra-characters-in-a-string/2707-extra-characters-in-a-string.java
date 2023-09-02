class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // Initialize with the worst case: removing one character

            for (int j = i - 1; j >= 0; j--) {
                String substring = s.substring(j, i);
                if (dictSet.contains(substring)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }

        return dp[n];
    }
}
