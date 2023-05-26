class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String sentence : sentences) {
            int count = sentence.split(" ").length;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}