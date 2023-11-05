class Solution {
    public int maxPower(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int cnt=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                cnt++;
                i++;
            }
            if(cnt>ans) ans=cnt;
        }
        return ans; 
    }
}