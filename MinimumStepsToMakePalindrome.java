//Recursive O(2^n) solution
// class Solution {
//     public int minInsertions(String s) {
//         return helper(s, 0, s.length() - 1);
//     }

//     private int helper(String str, int f, int b) {

//         if (f > b || f==b) {
//             return 0; 

//         }

//         if (str.charAt(f) == str.charAt(b)) {
//             return helper(str, f + 1, b - 1);
//         } 

//         else {
//             return 1 + Math.min(helper(str, f + 1, b), helper(str, f, b - 1));
//         }
//     }
// }


//O(n^2)
class Solution {
    public int minInsertions(String s) {
        // dp implementation
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return helper(s, 0, s.length() - 1, dp);
    }

    private int helper(String str, int f, int b, int[][] dp) {
        if (dp[f][b] != -1) {
            return dp[f][b];
        } else {
            if (f > b || f == b) {
                dp[f][b] = 0;
                return 0;

            }

            if (str.charAt(f) == str.charAt(b)) {
                return helper(str, f + 1, b - 1, dp);
            }

            else {

                dp[f][b] = 1 + Math.min(helper(str, f + 1, b, dp), helper(str, f, b - 1, dp));
                return dp[f][b];
            }
        }
    }
}
