class Solution {
    public int longestOnes(int[] nums, int k) {
        if (k != 0) {
            int l = 0, r = 0, maxLen = 0;
            List<Integer> indx = new ArrayList<>();  // To store indices of zeros

            while (r < nums.length) {
                // If nums[r] is 1, expand the window
                if (nums[r] == 1) {
                    maxLen = Math.max(maxLen, r - l + 1);  // Update maxLen
                    r++;  // Move right pointer forward
                }
                // If nums[r] is 0 and we have flips available (k > 0)
                else if (nums[r] == 0 && k > 0) {
                    indx.add(r);  // Add the index of the zero
                    k--;  // Use a flip
                    maxLen = Math.max(maxLen, r - l + 1);  // Update maxLen
                    r++;  // Move right pointer forward
                }
                // If nums[r] is 0 and no flips are available (k == 0)
                else if (nums[r] == 0 && k == 0) {
                    // Move the left pointer to the position after the first flipped zero
                    l = indx.get(0) + 1;
                    indx.remove(0);  // Remove the first flipped zero from the list
                    k++;  // Reclaim a flip since we're "removing" that zero flip
                }
            }

            return maxLen;
        } else {
            // When k == 0, we just need to find the longest subarray of 1s
            int l = 0, r = 0, maxLen = 0;

            while (r < nums.length) {
                // If nums[r] is 1, expand the window
                if (nums[r] == 1) {
                    maxLen = Math.max(maxLen, r - l + 1);  // Update maxLen
                } else {
                    // Shrink the window to move past the zero
                    l = r + 1;  // Move left pointer past the current zero
                }
                r++;  // Move right pointer forward
            }

            return maxLen;
        }
    }
}
