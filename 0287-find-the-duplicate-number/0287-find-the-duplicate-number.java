class Solution {
    // public int findDuplicate(int[] nums) {
    //   Arrays.sort(nums);
    //   for( int i=0; i<nums.length;i++){
    //       if(nums[i+1]==nums[i]){
    //           return nums[i];
    //       }
    //   }
    //     return -1;
    // }
    // public int findDuplicate(int[] nums) {
    //     Set<Integer> seen = new HashSet<Integer>();
    //     for(int i: nums){
    //         if(seen.contains(i))
    //             return i;
    //         seen.add(i);
    //     }
    //     return -1;
    // }
    public int findDuplicate(int[] nums){
        while(nums[0]!=nums[nums[0]]){
            int nxt=nums[nums[0]];
            nums[nums[0]]=nums[0];
            nums[0]=nxt;
        }
        return nums[0];
    }
}