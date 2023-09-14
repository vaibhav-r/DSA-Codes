class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans=new ArrayList<>();
        
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                if(!ans.contains(nums1[i])&&nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int[] res=new int[ans.size()];
        for(i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}