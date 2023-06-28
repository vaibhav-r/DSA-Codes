class Solution {
    public char findTheDifference(String s, String t) {
        int[] cnt=new int[26];
        for(char i: s.toCharArray()){
            cnt[i-'a']++;
        }
        for(char i: t.toCharArray()){
            cnt[i-'a']--;
            if(cnt[i-'a']<0) return i;
        }
        return ' ';
        
    }
}