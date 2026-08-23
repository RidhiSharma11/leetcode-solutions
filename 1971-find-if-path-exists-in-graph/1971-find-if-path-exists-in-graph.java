class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        List<List<Integer>>graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return dfs(source,destination,graph,visited);       
    }
    boolean dfs(int source, int destination,
                List<List<Integer>> graph,
                boolean[] visited) {

        if (source == destination) {
            return true;
        }

        visited[source] = true;

        for (int ngh : graph.get(source)) {

            if (!visited[ngh]) {

                if (dfs(ngh, destination, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
}
}