import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] x = new int[k];
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        // Create a list to hold the entries of the HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h.entrySet());

        // Sort the list based on the values (frequencies) in descending order
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < k; i++) {
            x[i] = list.get(i).getKey();
        }

        return x;
    }
}
