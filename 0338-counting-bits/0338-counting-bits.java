class Solution {
    public int[] countBits(int n) {
        int[] bits=new int[n+1];
        int offer=1;
        for(int i=1;i<=n;i++){
            if(offer*2==i) offer*=2;
            bits[i]=bits[i-offer]+1;
        }
        return bits;
    }
}