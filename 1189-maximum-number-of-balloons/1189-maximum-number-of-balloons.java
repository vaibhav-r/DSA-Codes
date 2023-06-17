class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] charCounts = new int[26]; // Array to store the count of each character
        for (char c : text.toCharArray()) {
            charCounts[c - 'a']++; // Increment the count of the character
        }

        // Count the minimum occurrences of the characters 'b', 'a', 'l', 'o', 'n'
        int minOccurrences = Math.min(charCounts['b' - 'a'], Math.min(charCounts['a' - 'a'], charCounts['n' - 'a']));
        int minOccurrences2 = Math.min(charCounts['l' - 'a'] / 2, charCounts['o' - 'a'] / 2);

        // Return the maximum number of instances that can be formed
        return Math.min(minOccurrences, Math.min(minOccurrences2, charCounts['o' - 'a']));
    }
}
