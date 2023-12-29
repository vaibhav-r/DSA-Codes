class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] strength = new int[m];
        
        for (int i = 0; i < m; i++) {
            strength[i] = countSoldiers(mat[i]);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> strength[a] == strength[b] ? a - b : strength[a] - strength[b]
        );
        
        for (int i = 0; i < m; i++) {
            minHeap.offer(i);
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;
    }
    private int countSoldiers(int[] row) {
        int left = 0;
        int right = row.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
}