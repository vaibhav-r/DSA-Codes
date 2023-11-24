class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(a) != frequencyMap.get(b) ? 
                      frequencyMap.get(a) - frequencyMap.get(b) : b - a
        );

        for (int num : frequencyMap.keySet()) {
            pq.offer(num);
        }

        int index = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                nums[index++] = num;
            }
        }
        return nums;
    }
}