import java.util.*;

public class BFSGraph {

    int V;
    ArrayList<ArrayList<Integer>> adj;

    BFSGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove for directed graph
    }

    void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFSGraph g = new BFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        System.out.println("BFS Traversal:");
        g.bfs(0);
    }
}

