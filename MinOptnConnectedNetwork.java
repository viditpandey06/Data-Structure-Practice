import java.util.*;
public class MinOptnConnectedNetwork {
    public static void main(String[] args) {
        System.out.println("Enter the number of nodes: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] graph = {{0,1},{0,2},{0,3},{1,2},{1,3}};
        System.out.println("Matrix: ");
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        Solution sl = new Solution();
        System.out.println(sl.makeConnected(n, graph));
    }
}
// Algorithm:-
// Step 1 Create adj. list from the given inout
// Step 2 Get number of edges and if no. of edges < no. of nodes-1 return -1
// Step 3 Get all the non connected nodes (Use DFS/ BFS) and return no. of non connected nodes -1 as result.

class Solution {
    public static int makeConnected(int n, int[][] connections) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj = createList(n, connections);
        int edges = connections.length;
        if(edges < n-1){
            return -1;
        }
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i, vis, adj);
                count++;
            }
        }
        return count-1;
    }
    public static ArrayList<ArrayList<Integer>> createList (int n, int[][] connections){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        System.out.println("Adjacency List: "+adj);
        return adj;
    }
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, adj);
            }
        }
    }
}
