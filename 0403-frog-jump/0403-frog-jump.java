class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        
        // Create a HashMap to store the possible jump distances for each stone
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        
        map.get(0).add(0); // Starting from the first stone with 0 jump
        
        for (int i = 0; i < n; i++) {
            for (int jump : map.get(stones[i])) {
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && map.containsKey(stones[i] + nextJump)) {
                        map.get(stones[i] + nextJump).add(nextJump);
                    }
                }
            }
        }
        
        return !map.get(stones[n - 1]).isEmpty();
    }
}
