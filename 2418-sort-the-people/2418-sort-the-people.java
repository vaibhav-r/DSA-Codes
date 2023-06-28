

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];

        // Create an array of Pairs to store names and heights together
        Pair[] people = new Pair[n];
        for (int i = 0; i < n; i++) {
            people[i] = new Pair(names[i], heights[i]);
        }

        // Sort the array in descending order of heights
        Arrays.sort(people, (a, b) -> b.height - a.height);

        // Extract the sorted names
        for (int i = 0; i < n; i++) {
            sortedNames[i] = people[i].name;
        }

        return sortedNames;
    }

    private static class Pair {
        String name;
        int height;

        public Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}
