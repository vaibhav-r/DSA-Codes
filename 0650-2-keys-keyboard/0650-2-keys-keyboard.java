class Solution {
    public int minSteps(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        return cnt(map, n);
    }

    public int cnt(HashMap<Integer, Integer> map, int n) {
        if (map.containsKey(n)) return map.get(n);
        
        int minSteps = n; // Initialize with the maximum possible steps (worst case)
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                minSteps = Math.min(minSteps, cnt(map, i) + n / i);
            }
        }
        
        map.put(n, minSteps);
        return minSteps;
    }
}