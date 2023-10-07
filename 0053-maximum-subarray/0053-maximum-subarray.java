class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,csum=nums[0];
        for(int i: nums){
            sum+=i;
            csum=csum<sum ? sum:csum;
             if(sum<0) sum=0;
        }
        return csum;
    }
}