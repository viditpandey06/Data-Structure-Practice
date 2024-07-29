public class MaximumProductSubArray {
  public static void main(String[] args) {
    MaximumProductSubArray obj = new MaximumProductSubArray();
    int[] nums = {2, -8, -2, 4};
    System.out.println(obj.maxProduct(nums));
  }
   public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}