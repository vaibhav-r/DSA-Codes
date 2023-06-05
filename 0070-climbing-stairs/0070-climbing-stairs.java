class Solution {
    public int climbStairs(int n) {
        int pre=1,pre2=1;
        for(int i=2;i<=n;i++){
            int curr=pre+pre2;
            pre2=pre;
            pre=curr;
        }
        return pre;
    }
}