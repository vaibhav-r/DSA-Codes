class Solution {
    public int largestAltitude(int[] gain) {
        int cnt=0,ini=0;
        for(int i=0;i<gain.length;i++){
            ini+=gain[i];
            if(ini>cnt) cnt=ini;
        }
        return cnt;
    }
}