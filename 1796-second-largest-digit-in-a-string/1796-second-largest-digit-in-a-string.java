class Solution {
    public int secondHighest(String s) {
        int firstMax = -1;
        int secondMax = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit > firstMax) {
                    secondMax = firstMax;
                    firstMax = digit;
                } else if (digit < firstMax && digit > secondMax) {
                    secondMax = digit;
                }
            }
        }

        return secondMax;
    }
}