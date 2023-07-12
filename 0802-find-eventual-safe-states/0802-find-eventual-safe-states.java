class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // 0: not visited, 1: visiting, 2: safe
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (isSafe(graph, i, colors))
                result.add(i);
        }

        return result;
    }

    private boolean isSafe(int[][] graph, int node, int[] colors) {
        if (colors[node] > 0) {
            return colors[node] == 2;
        }

        colors[node] = 1; // Mark the node as visiting

        for (int neighbor : graph[node]) {
            if (!isSafe(graph, neighbor, colors))
                return false;
        }

        colors[node] = 2; // Mark the node as safe
        return true;
    }
}