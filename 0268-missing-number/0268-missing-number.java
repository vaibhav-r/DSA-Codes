class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(int num: nums){
            if(i!=num) return i;
            i++;
        }
        return nums.length;
    }
}