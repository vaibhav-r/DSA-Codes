class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int ans=0,s=0;
        int[] sum=new int[n*(n+1)/2];
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                temp+=nums[j];
                sum[s++]=temp;
            }
        }
        Arrays.sort(sum);
        int mod=1_000_000_007;
        for(int i=left-1;i<right;i++){
            ans=(ans+sum[i])%mod;
        }
        return (int)ans;
    }
}