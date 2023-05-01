class Solution {
    public int kthFactor(int n, int k) {
        if(k==1) return 1;
        int count=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                if(count==k) return i;
            }
        }
        if(count+1==k) return n;
        else return -1;
        
    }
}