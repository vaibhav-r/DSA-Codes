class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<m || i<n){
            if(i<m){
                str.append(word1.charAt(i));
            }
            if(i<n){
                str.append(word2.charAt(i));
            }
            i++;
        }
        return str.toString();
    }
}