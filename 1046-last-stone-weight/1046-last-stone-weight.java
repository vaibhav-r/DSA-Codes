class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        Arrays.sort(stones);
        for(int i=stones.length-2;i>=0;i--){
            if(stones[i]!=stones[i+1]){
                stones[i]=stones[i+1]-stones[i];
                Arrays.sort(stones);
            }
            else{
                stones[i]=0;
                Arrays.sort(stones);
            }
        }
        return stones[0];
    }
}