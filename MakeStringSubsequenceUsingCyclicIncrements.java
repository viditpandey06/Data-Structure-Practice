public class MakeStringSubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "abc";
        String str2 = "bcd";
        boolean result = solution.canMakeSubsequence(str1, str2);
        System.out.println("Can make subsequence: " + result);
    }
}

class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int i = 0, j = 0;

        // Edge case: If str2 is empty, it can always be a subsequence.
        if (m == 0) {
            return true;
        }

        while (i < n) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            // Check if characters match directly or can match by incrementing (cyclically).
            if (c1 == c2 || (c1 + 1 - 'a') % 26 == (c2 - 'a') % 26) {
                j++;
            }
            i++;

            // If all characters of str2 are matched, return true.
            if (j == m) {
                return true;
            }
        }

        // If the loop ends without matching all characters of str2.
        return false;
    }
}
