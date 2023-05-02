class Solution {
    public int findTheWinner(int n, int k) {
        return findWinner(n, k) + 1; // Add 1 to convert 0-based index to 1-based index
    }
    
    private int findWinner(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int winner = (findWinner(n - 1, k) + k) % n;
        return winner;
    }
}
