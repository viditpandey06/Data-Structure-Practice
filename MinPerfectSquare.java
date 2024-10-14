// //TLE O(n^1/2^n)
// class Solution {
//     public int numSquares(int n) {
//         List<Integer> aList = new ArrayList<>();
//         aList = perfectSquares(n);
//         int ans = helper(n, aList);
//         return ans;
//     }

//     // This method generates all perfect squares <= n
//     private List<Integer> perfectSquares(int n) {
//         ArrayList<Integer> result = new ArrayList<>();

//         for (int i = 1; i * i <= n; i++) {
//             result.add(i * i);
//         }

//         return result;
//     }

//     // Helper function to find the minimum number of perfect squares that sum to n
//     private int helper(int n, List<Integer> aList) {
//         if (n < 0) {
//             return Integer.MAX_VALUE; // If n becomes negative, this is not a valid solution
//         }
//         if (n == 0) {
//             return 0; // If n is exactly 0, we've found a valid solution
//         }

//         int minLen = Integer.MAX_VALUE; // Initialize minLen to the maximum value

//         // Try using each perfect square from the list
//         for (int i = 0; i < aList.size(); i++) {
//             int currentSquare = aList.get(i);
//             int subProblem = helper(n - currentSquare, aList); // Recursively solve for (n - currentSquare)

//             // If the subproblem didn't return an invalid result (i.e., Integer.MAX_VALUE), update minLen
//             if (subProblem != Integer.MAX_VALUE) {
//                 minLen = Math.min(minLen, 1 + subProblem); // Add 1 for the current square used
//             }
//         }

//         return minLen;
//     }
// }

//O(n*n^1/2)
import java.util.ArrayList;
import java.util.List;

class Solution {
    // DP array to store results
    private int[] dp;

    public int numSquares(int n) {
        dp = new int[n + 1]; // Create the dp array
        for (int i = 0; i <= n; i++) {
            dp[i] = -1; // Initialize all elements to -1 (uncomputed)
        }
        dp[0] = 0; // Base case: 0 squares needed to sum to 0

        List<Integer> aList = perfectSquares(n); // Generate list of perfect squares <= n
        return helper(n, aList); // Call the helper function
    }

    // This method generates all perfect squares <= n
    private List<Integer> perfectSquares(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            result.add(i * i);
        }

        return result;
    }

    // Helper function to find the minimum number of perfect squares that sum to n
    private int helper(int n, List<Integer> aList) {
        // If we've already computed dp[n], return the result
        if (n < 0) {
            return Integer.MAX_VALUE; // If n becomes negative, it's an invalid path
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int minLen = Integer.MAX_VALUE; // Initialize minLen to the maximum value

        // Try using each perfect square from the list
        for (int i = 0; i < aList.size(); i++) {
            int currentSquare = aList.get(i);
            int subProblem = helper(n - currentSquare, aList); // Recursively solve for (n - currentSquare)

            // If the subproblem didn't return an invalid result (i.e., Integer.MAX_VALUE), update minLen
            if (subProblem != Integer.MAX_VALUE) {
                minLen = Math.min(minLen, 1 + subProblem); // Add 1 for the current square used
            }
        }

        // Store the result in dp array before returning it
        dp[n] = minLen;
        return dp[n];
    }
}
