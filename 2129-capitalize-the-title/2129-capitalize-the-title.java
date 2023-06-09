class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        int n = title.length();
        char[] titleArray = title.toCharArray();
        for (int i = 0; i < n; i++) {
            if (titleArray[i] != ' ' && i + 1 < n && titleArray[i + 1] != ' ' && i + 2 < n && titleArray[i + 2] != ' ') {
                titleArray[i] = Character.toUpperCase(titleArray[i]);
            }
            while (i < n && titleArray[i] != ' ') {
                i++;
            }
        }
        return new String(titleArray);
    }
}
