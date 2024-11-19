import java.util.*;
public class SubArrayKDiffIntegers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(sol.subarraysWithKDistinct(nums, k));
    }
}


class Solution {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return slideWindow(nums, k) - slideWindow(nums, k - 1);
    }

    private static int slideWindow(int[] nums, int k) {
        int l = 0, r = 0, result = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        while (r < nums.length) {
            // Add the current number to the map
            hMap.put(nums[r], hMap.getOrDefault(nums[r], 0) + 1);
            
            // Shrink the window if the number of distinct elements exceeds k
            while (hMap.size() > k) {
                hMap.put(nums[l], hMap.get(nums[l]) - 1);
                if (hMap.get(nums[l]) == 0) {
                    hMap.remove(nums[l]);
                }
                l++;
            }
            
            // Add the number of subarrays ending at r
            result += (r - l + 1);
            r++;
        }
        
        return result;
    }
}

