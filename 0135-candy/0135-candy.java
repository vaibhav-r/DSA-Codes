class Solution {
    public int candy(int[] ratings) {
    int n = ratings.length;
    if (n <= 1) {
        return n;
    }

    int[] candies = new int[n];
    Arrays.fill(candies, 1);

    // Scan from left to right, ensure right neighbor gets more candies if its rating is higher
    for (int i = 1; i < n; i++) {
        if (ratings[i] > ratings[i - 1]) {
            candies[i] = candies[i - 1] + 1;
        }
    }

    // Scan from right to left, ensure left neighbor gets more candies if its rating is higher
    for (int i = n - 2; i >= 0; i--) {
        if (ratings[i] > ratings[i + 1]) {
            candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
    }

    int totalCandies = 0;
    for (int candy : candies) {
        totalCandies += candy;
    }

    return totalCandies;
}

}