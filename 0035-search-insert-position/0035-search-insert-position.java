class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int lo=0,hi=n-1;
        int mid=n/2;
        while(lo<=hi){
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
            mid=(lo+hi)/2;
        }
        return lo;
        
    }
}