class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans=new int[n];
        int sum=mean*(rolls.length+n);
        for(int x:rolls){
            sum-=x;
        }
        int avg = sum / n;
        if(sum>6*n || sum<n) return new int[0];
        int remainder = sum % n;

        for (int i = 0; i < n; i++) {
            ans[i] = avg + (i < remainder ? 1 : 0);
        }

        return ans;
    }
}