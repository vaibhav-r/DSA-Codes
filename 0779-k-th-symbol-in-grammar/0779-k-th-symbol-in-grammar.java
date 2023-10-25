class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;  // Base case
        }

        int mid = (int)Math.pow(2, n - 1) / 2;  // Calculate the middle position of the current row

        if (k <= mid) {
            return kthGrammar(n - 1, k);  // k is in the first half, same as (n-1)-th row
        } else {
            return 1 - kthGrammar(n - 1, k - mid);  // k is in the second half, complement of (n-1)-th row
        }
    }

}