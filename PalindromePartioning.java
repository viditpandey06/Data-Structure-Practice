// class Solution {

//     public List<List<String>> partition(String s) {
//         List<List<String>> res = new ArrayList<>();
//         solver("", s, res, new ArrayList<>());
//         return res;
//     }

//     private void solver(String str, String rem_str, List<List<String>> res, List<String> ans) {
//         // Base case: if no remaining string, add the current answer list to results
//         if (rem_str.equals("")) {
//             res.add(new ArrayList<>(ans));
//             return;
//         }

//         // If the current prefix is not a palindrome, terminate this path
//         if (!isPalindrome(str)) {
//             return;
//         }

//         // If it's a palindrome, add the current string to the answer list
//         ans.add(str);

//         // Loop through the remaining string to partition further
//         for (int i = 0; i < rem_str.length(); i++) {
//             solver(rem_str.substring(0, i + 1), rem_str.substring(i + 1), res, ans);
//             if (!ans.isEmpty()) {  // Check to ensure there are elements to remove
//             ans.remove(ans.size() - 1); // Backtracking step
//         }
//         }
//     }

//     private boolean isPalindrome(String s) {
//         int i = 0;
//         int k = s.length() - 1;

//         while (i < k) {
//             if (s.charAt(i) != s.charAt(k)) {
//                 return false; // Return false if characters don't match
//             }
//             i++;
//             k--;
//         }

//         return true; // Return true if the entire string is a palindrome
//     }
// }



import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solver(s, res, new ArrayList<>());  // Start partitioning from the full string
        return res;
    }

    private void solver(String rem_str, List<List<String>> res, List<String> ans) {
        // Base case: if no remaining string, add the current answer list to results
        if (rem_str.equals("")) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // Loop through the remaining string to partition further
        for (int i = 0; i < rem_str.length(); i++) {
            String prefix = rem_str.substring(0, i + 1); // Get the current prefix
            if (isPalindrome(prefix)) {
                ans.add(prefix);  // Add the palindrome prefix to the answer list
                solver(rem_str.substring(i + 1), res, ans); // Recur on the remaining string
                ans.remove(ans.size() - 1); // Backtracking step
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int k = s.length() - 1;

        while (i < k) {
            if (s.charAt(i) != s.charAt(k)) {
                return false; // Return false if characters don't match
            }
            i++;
            k--;
        }

        return true; // Return true if the entire string is a palindrome
    }
}
