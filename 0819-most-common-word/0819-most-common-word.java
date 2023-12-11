class Solution { 
    public String mostCommonWord(String paragraph, String[] banned) {
                paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Split the paragraph into words
        String[] words = paragraph.split("\\s+");

        // Create a set of banned words for efficient lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Create a map to store word frequencies
        Map<String, Integer> wordFreqMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
            }
        }

        // Find the most frequent word
        String mostCommonWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFreqMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostCommonWord;
    }
}
