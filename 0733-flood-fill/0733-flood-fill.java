class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            dfs(image, sr, sc, oldColor, newColor);
        }
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor) {
            return;
        }
        image[r][c] = newColor;
        int[][] arr = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for(int i=0;i<arr.length;i++){
            dfs(image,r+arr[i][0],c+arr[i][1],oldColor,newColor);
        }
    }
}
