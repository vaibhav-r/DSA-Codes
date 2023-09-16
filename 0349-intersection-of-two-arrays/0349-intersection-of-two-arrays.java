class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Find the intersection by retaining only common elements
        set1.retainAll(set2);
        
        // Convert the result set to an array
        int[] result = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            result[i++] = num;
        }
        
        return result;
    }
}