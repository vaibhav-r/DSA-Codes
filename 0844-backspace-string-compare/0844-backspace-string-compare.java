class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (s.charAt(i) == '#' || skipS > 0)) {
                if (s.charAt(i) == '#') {
                    skipS++;
                } else {
                    skipS--;
                }
                i--;
            }

            while (j >= 0 && (t.charAt(j) == '#' || skipT > 0)) {
                if (t.charAt(j) == '#') {
                    skipT++;
                } else {
                    skipT--;
                }
                j--;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }

            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true; 
    }
}