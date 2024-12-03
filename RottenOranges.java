import java.util.*;
public class RottenOranges {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.println(sl.orangesRotting(grid));

    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int freshCnt = 0;
        int time = 0;
        Queue<int[]> queue = new LinkedList<>(); // Fixed typo from Linkledlist to LinkedList

        // Step 1: Count fresh oranges and add rotten oranges to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    freshCnt++; // Count fresh oranges
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j}); // Add rotten orange to the queue
                }
            }
        }

        // If no fresh oranges exist, return 0 (no time needed)
        if (freshCnt == 0) {
            return time;
        }

        // Step 2: BFS to spread the rot
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean newRotten = false; // Track if any new oranges rot in this iteration

            for (int i = 0; i < size; i++) {
                int[] rLoc = queue.poll();
                int r = rLoc[0];
                int c = rLoc[1];

                // Directions for adjacent cells (up, down, left, right)
                int[][] nLoc = {
                    {r - 1, c}, {r + 1, c}, {r, c - 1}, {r, c + 1}
                };

                for (int[] cell : nLoc) {
                    int newRow = cell[0];
                    int newCol = cell[1];

                    // Check bounds and if the cell contains a fresh orange
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Mark as rotten
                        queue.offer(new int[]{newRow, newCol}); // Add to queue
                        freshCnt--; // Decrement fresh orange count
                        newRotten = true; // Indicate new oranges became rotten
                    }
                }
            }

            // Increment time only if new oranges rotted
            if (newRotten) {
                time++;
            }
        }

        // Step 3: Check if all fresh oranges are rotten
        return (freshCnt == 0) ? time : -1;
    }
}
