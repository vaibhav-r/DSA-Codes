class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0,nums1=-1,nums2=-1;
        for(int i:nums){
            if(nums1==i) cnt1++;
            else if(nums2==i) cnt2++;
            else if(cnt1==0){
                nums1=i;
                cnt1++;
            }
            else if(cnt2==0){
                nums2=i;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            } 
        }
        List<Integer> ans=new ArrayList<>();
        cnt1=cnt2=0;
        for(int i:nums){
            if(i==nums1) cnt1++;
            else if(i==nums2) cnt2++;
        }
        if(cnt1>nums.length/3) ans.add(nums1);
        if(cnt2>nums.length/3) ans.add(nums2);
        return ans;
    }
}