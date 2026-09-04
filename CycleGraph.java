import java.util.ArrayList;
import java.util.List;

public class CycleGraph {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        System.out.println(hasCycle(3, adj)); 
    }

    static boolean hasCycle(int V, List<List<Integer>> adj) {
        int[] color = new int[V]; 

        for (int i = 0; i < V; i++) {
            if (color[i] == 0 && dfs(i, color, adj)) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(int node, int[] color, List<List<Integer>> adj) {
        color[node] = 1; 

        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == 1) {
                return true; 
            }
            if (color[neighbor] == 0 && dfs(neighbor, color, adj)) {
                return true;
            }
        }

        color[node] = 2; 
        return false;
    }
}
