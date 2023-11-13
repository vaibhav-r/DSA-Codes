class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();

            for (char ch : word.toCharArray()) {
                if (ch != separator) {
                    currentWord.append(ch);
                } else {
                    if (currentWord.length() > 0) {
                        result.add(currentWord.toString());
                        currentWord.setLength(0);
                    }
                }
            }

            if (currentWord.length() > 0) {
                result.add(currentWord.toString());
            }
        }

        return result; 
    }
}