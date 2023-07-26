class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] cumulativePopulation = new int[101]; // 1950 to 2050 (inclusive) = 101 years
        for (int[] log : logs) {
            cumulativePopulation[log[0] - 1950]++; // Increment birth year count
            cumulativePopulation[log[1] - 1950]--; // Decrement death year count
        }

        int maxPopulation = 0;
        int maxPopulationYear = 0;
        int currentPopulation = 0;

        for (int i = 0; i < cumulativePopulation.length; i++) {
            currentPopulation += cumulativePopulation[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxPopulationYear = i + 1950;
            }
        }

        return maxPopulationYear;
    }

}