import java.util.HashMap;

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        //O(n^3)
        // Loop over all substrings
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hMap = new HashMap<>();
            
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                
                // Update character count
                hMap.put(c, hMap.getOrDefault(c, 0) + 1);
                
                // Calculate maxFreq and minFreq
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;
                
                for (int count : hMap.values()) {
                    maxFreq = Math.max(maxFreq, count);
                    minFreq = Math.min(minFreq, count);
                }
                
                // Add the difference between maxFreq and minFreq
                ans += (maxFreq - minFreq);
            }
        }
        
        return ans;
    }
}
// Time Complexity: O(n^3)