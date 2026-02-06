import java.util.*;

public class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this for directed graph
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
