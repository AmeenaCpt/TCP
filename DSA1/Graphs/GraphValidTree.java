package DSA1.Graphs;
import java.util.*;

public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        // Tree must have exactly n - 1 edges
        if (edges.length != n - 1) return false;

        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // DFS traversal
        boolean[] visited = new boolean[n];
        if (!dfs(0, -1, graph, visited)) return false;

        // Check if all nodes are visited (i.e., graph is connected)
        for (boolean v : visited)
            if (!v) return false;

        return true;
    }

    private boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        if (visited[node]) return false;
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;
            if (!dfs(neighbor, node, graph, visited)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        GraphValidTree obj = new GraphValidTree();

        int[][] edges1 = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};

        System.out.println("Is valid tree 1: " + obj.validTree(5, edges1)); // true
        System.out.println("Is valid tree 2: " + obj.validTree(5, edges2)); // false
    }
}
