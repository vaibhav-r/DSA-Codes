class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String concatinated=s+s;
        return concatinated.contains(goal);
    }
}