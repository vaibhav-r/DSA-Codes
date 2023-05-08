class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,x=0,y=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][x];
            if(x!=y) sum+=mat[i][y];
            x++;
            y--;
        }
        return sum;
    }
}