import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {
    public static List<Integer> dfs(int n, List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[n];
        List<Integer> order = new ArrayList<>();
        dfsUtil(start, graph, visited, order);
        return order;
    }

    private static void dfsUtil(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> order) {
        visited[node] = true;
        order.add(node);

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                dfsUtil(nei, graph, visited, order);
            }
        }
    }

    public static void addUndirectedEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addUndirectedEdge(graph, 0, 1);
        addUndirectedEdge(graph, 0, 2);
        addUndirectedEdge(graph, 1, 3);
        addUndirectedEdge(graph, 2, 4);
        addUndirectedEdge(graph, 4, 5);

        System.out.println(dfs(n, graph, 0));
    }
}