import java.util.*;
class NiceSubarrays {
    public static void main(String[] args) {
        NiceSubarrays niceSubarrays = new NiceSubarrays();
        int[] nums = {1, 1, 1, 1, 1};
        int k = 3;
        System.out.println(niceSubarrays.numberOfSubarrays(nums, k));
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, oddCount = 0;
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1); // Base case for subarrays starting from index 0
        
        for (int num : nums) {
            // Increment odd count if the number is odd
            if (num % 2 != 0) {
                oddCount++;
            }
            
            // Check for subarrays ending at the current index with k odd numbers
            count += prefixMap.getOrDefault(oddCount - k, 0);
            
            // Update the prefix map with the current odd count
            prefixMap.put(oddCount, prefixMap.getOrDefault(oddCount, 0) + 1);
        }
        
        return count;
    }
}