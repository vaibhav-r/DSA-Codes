class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int lo=0,hi=nums.length-1;
        while(lo<=hi) {
            int mid=(lo+hi)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
