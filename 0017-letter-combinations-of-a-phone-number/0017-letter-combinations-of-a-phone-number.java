class Solution { 
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
 
        Map<Character, String> phoneMap = new HashMap<>();
        
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        backtrack(result, phoneMap, digits, new StringBuilder(), 0);
 
        return result;
    }

    private void backtrack(List<String> result, Map<Character, String> phoneMap, String digits, StringBuilder current, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, phoneMap, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
