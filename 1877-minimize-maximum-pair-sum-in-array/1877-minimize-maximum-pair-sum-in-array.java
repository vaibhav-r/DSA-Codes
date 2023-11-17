class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int max=0,hi=nums.length-1,lo=0;
        while(hi>lo){
            int sum=nums[hi]+nums[lo];
            max=max<sum ? sum : max;
            //max= Math.max(sum,max);
            hi--;
            lo++;
        }
        return max;
    }
}