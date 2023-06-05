class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int curr=0,prev=1,prev2=0;
        for(int i=2;i<=n;i++){
            curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
}