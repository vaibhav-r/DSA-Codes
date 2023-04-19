class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] ans=new Boolean[candies.length];
        //int a=Collections.max(candies);
        int a=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>a) a=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=a){
                ans[i]=true;
            }
            else ans[i]=false;
        }
        return Arrays.asList(ans);
    }
}