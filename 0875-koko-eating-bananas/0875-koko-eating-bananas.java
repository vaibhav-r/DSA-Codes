class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0, high=maximumm(piles),hr=0;
        while(low<=high){
            int mid=(low+high)/2;
            hr=speed(piles,mid);
            if(hr<=h) high=mid-1;
            else low=mid+1;
        }
        return low;   
    }
    
    public int maximumm(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return max;
    }
    
    public int speed(int[] piles,int mid){
        int ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=Math.ceil((double)piles[i]/(double)mid);
        }
        return ans;
    }
}