class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] distances = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        
        // Initialize distances for all cells to -1 (unvisited)
        for (int i = 0; i < m; i++) {
            Arrays.fill(distances[i], -1);
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    distances[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && distances[newX][newY] == -1) {
                    distances[newX][newY] = distances[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
        
        return distances;
    }
}
