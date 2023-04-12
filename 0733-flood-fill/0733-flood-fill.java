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
// OR
// class Solution {
//     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//         int color = image[sr][sc];
//         if (color != newColor) dfs(image, sr, sc, color, newColor);
//         return image;
//     }
//     public void dfs(int[][] image, int r, int c, int color, int newColor) {
//         if (image[r][c] == color) {
//             image[r][c] = newColor;
//             if (r >= 1) dfs(image, r-1, c, color, newColor);
//             if (c >= 1) dfs(image, r, c-1, color, newColor);
//             if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
//             if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
//         }
//     }
// }
