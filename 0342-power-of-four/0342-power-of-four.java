class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        while(n>=4){
            if(n==4) return true;
            if(n%4==0)  n/=4;
            else return false;
        }
        return false;
    }
}