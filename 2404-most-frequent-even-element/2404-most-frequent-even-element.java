class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mostFrequentEvenElement = -1;

        for (int num : nums) {
            if (num % 2 == 0) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                int frequency = frequencyMap.get(num);
                if (frequency > maxFrequency || (frequency == maxFrequency && num < mostFrequentEvenElement)) {
                    maxFrequency = frequency;
                    mostFrequentEvenElement = num;
                }
            }
        }

        return mostFrequentEvenElement;
    }
}