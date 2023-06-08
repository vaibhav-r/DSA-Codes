class Solution {
    public int countNegatives(int[][] grid) {
        int cnt=0;
        int r=grid[0].length-1;
        for(int[] row:grid){
            while(r>=0 && row[r]<0 ){
                cnt++;
                r--;
            }
            r=grid[0].length-1;
        }
        return cnt;
    }
}