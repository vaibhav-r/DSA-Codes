class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char a=letters[0];
        for(char s: letters){
            if(s>target) return s;
        }
        return a;
    }
}