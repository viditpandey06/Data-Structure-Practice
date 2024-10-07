//O(2^n)
class TargetSumRecursive {
      public static void main(String[]args){
        int [] nums = {1,1,1,1,1,1};
        System.out.println(findTargetSumWays(nums,3));
        findTargetSumWays(nums, target);
      }
    private static int findTargetSumWays(int[] nums, int target) {
        
        int ans = helper(0,target,nums);
        return ans;
    }
    private static int helper(int indx, int target, int[]nums){
        if(indx==nums.length && target==0){
            return 1;
        }
        if(indx<nums.length){
            return helper(indx+1, (target-nums[indx]),nums)+ helper(indx+1,(target+nums[indx]),nums);

        }
        return 0;
    }
}