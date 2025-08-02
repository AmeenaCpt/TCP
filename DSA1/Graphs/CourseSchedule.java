package DSA1.Graphs;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            graph.add(new ArrayList<>());

        // Build adjacency list
        for (int[] pre : prerequisites)
            graph.get(pre[0]).add(pre[1]);

        // 0 = unvisited, 1 = visiting, 2 = visited
        int[] visited = new int[numCourses];

        // Check each course
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, visited, i))
                return false; // cycle detected
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int[] visited, int node) {
        if (visited[node] == 1) return false; // Found a cycle
        if (visited[node] == 2) return true;  // Already checked

        visited[node] = 1; // Mark as visiting
        for (int neighbor : graph.get(node)) {
            if (!dfs(graph, visited, neighbor)) return false;
        }
        visited[node] = 2; // Mark as visited
        return true;
    }

    public static void main(String[] args) {
        CourseSchedule obj = new CourseSchedule();
        int[][] prerequisites1 = {{1, 0}};
        int[][] prerequisites2 = {{1, 0}, {0, 1}};

        System.out.println("Can finish 1: " + obj.canFinish(2, prerequisites1)); // true
        System.out.println("Can finish 2: " + obj.canFinish(2, prerequisites2)); // false
    }
}
