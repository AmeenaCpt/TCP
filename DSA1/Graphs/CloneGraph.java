package DSA1.Graphs;

import java.util.*;

public class CloneGraph {

    // Static nested Node class
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        visited.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node neighbor : cur.neighbors) {
                if (!visited.containsKey(neighbor)) {
                    visited.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }
                visited.get(cur).neighbors.add(visited.get(neighbor));
            }
        }

        return visited.get(node);
    }

    public static void main(String[] args) {
        // Build test graph
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.addAll(Arrays.asList(node2, node4));
        node2.neighbors.addAll(Arrays.asList(node1, node3));
        node3.neighbors.addAll(Arrays.asList(node2, node4));
        node4.neighbors.addAll(Arrays.asList(node1, node3));

        CloneGraph obj = new CloneGraph();
        Node cloned = obj.cloneGraph(node1);
        System.out.println("Cloned node value: " + cloned.val); // Output: 1
    }
}
