class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] distribution = new int[num_people];
        int remainingCandies = candies;
        int currentCandies = 1;
        int index = 0;
        
        while (remainingCandies > 0) {
            distribution[index] += Math.min(remainingCandies, currentCandies);
            remainingCandies -= currentCandies;
            currentCandies++;
            index = (index + 1) % num_people;
        }
        
        return distribution;
    }
}