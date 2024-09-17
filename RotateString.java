class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are not equal, return false
        if (s.length() != goal.length()) {
            return false;
        }
        // Check if goal is a substring of s + s
        return (s + s).contains(goal);
    }
}
// Time Complexity: O(n^2)