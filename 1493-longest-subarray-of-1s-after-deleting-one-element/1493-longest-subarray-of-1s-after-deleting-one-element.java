class Solution {
    public int longestSubarray(int[] A) {
        int i = 0, j, k = 1, res = 0;
        for (j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (A[i] == 0) {
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
}
//OR
//class Solution{
//      public int longestSubarray(int[] A) {
//         int i = 0, j, k = 1;
//         for (j = 0; j < A.length; j++) {
//             if (A[j] == 0) k--;
//             if (k < 0 && A[i++] == 0) k++;
//         }
//         return j - i - 1;
//     }
// }