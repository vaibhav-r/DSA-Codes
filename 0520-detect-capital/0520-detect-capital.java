class Solution {
    public boolean detectCapitalUse(String word) {
        String str = word;
        return str.toUpperCase().equals(word) || str.toLowerCase().equals(word) || str.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
    }
}
