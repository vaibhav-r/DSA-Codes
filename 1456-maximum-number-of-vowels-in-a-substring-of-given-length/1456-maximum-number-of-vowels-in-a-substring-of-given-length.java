class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels=Set.of('a','e','i','o','u');
        int cnt=0;
        for(int i=0;i<k;i++){
            cnt+=vowels.contains(s.charAt(i)) ? 1:0;
        }
        int ans=cnt;
        for(int i=k;i<s.length();i++){
            cnt+=vowels.contains(s.charAt(i)) ? 1:0;
            cnt-=vowels.contains(s.charAt(i-k)) ? 1:0;
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}