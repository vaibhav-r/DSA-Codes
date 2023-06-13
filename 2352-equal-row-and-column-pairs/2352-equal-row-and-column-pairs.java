class Solution {
    public int equalPairs(int[][] grid) {
        int cnt=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean match=true;
                for(int x=0;x<n;x++){
                    if(grid[i][x]!=grid[x][j]){
                        match=false;
                        break;  
                    }
                }
                cnt +=match ? 1 : 0;
            }
        }
        return cnt;
    }
}