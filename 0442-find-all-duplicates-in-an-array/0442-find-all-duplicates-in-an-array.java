class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>(); 
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i])) ans.add(nums[i]);
            else{
                h.add(nums[i]);
            }
        }
        return ans;
    }
}