import java.util.HashMap;

public class twoSum1 {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 11, 15};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("The indices are: " + result[0] + " " + result[1]);
    }
    
    public static int[] twoSum(int[] nums, int target) {
          int [] arr = new int[2];
          HashMap<Integer, Integer> map = new HashMap<>();
          for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
          }
          for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.get(rem)!=null && map.get(rem)!=i) {
              arr[0]=i;
              arr[1]=map.get(rem);
              break;
            }
          }
          return arr;
    }
}
