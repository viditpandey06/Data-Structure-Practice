import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 11, 15 };
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println("The indices are: " + result[0] + " " + result[1]);
    }
    public static int [] twoSum(int [] nums , int target){
        int [] arr = new int [2];
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target && left!=right){
                arr[0]=nums[left];
                arr[1]=nums[right];
                break;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}
