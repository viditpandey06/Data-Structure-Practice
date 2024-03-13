public class maximumSubArray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("The maximum sum of the subarray is: " + maxSubArray(nums));
    }
    
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < nums.length; i++) {
           int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum = currSum + nums[j];
                max = Math.max(currSum, max);
            }
            
        }

        return max;
    }
}
