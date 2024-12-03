import java.util.*;
public class NumberOfProvinces {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };
        int numProvinces = solution.findCircleNum(isConnected);
        System.out.println("Number of Provinces: " + numProvinces);
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>(); 
        for (int i = 0; i < v; i++) {
            adjLs.add(new ArrayList<Integer>());
        }
        // Build the adjacency list from the isConnected matrix
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                // Only add edges where there is a connection (excluding self-connections)
                if (isConnected[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i); 
                }
            }
        }
        
        boolean[] isVisited = new boolean[v];
        int cntr = 0;
        
        // DFS to count the connected components
        for (int i = 0; i < v; i++) {
            if (!isVisited[i]) {
                cntr++;
                dfs(i, isVisited, adjLs);
            }
        }
        
        return cntr;    
    }

    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjLs) {
        vis[node] = true;
        for (Integer it : adjLs.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adjLs);
            }
        }
    }
}
