
import java.util.*;

class RotatedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        k = k % (nums.length);
        List<Integer> list = new ArrayList<Integer>();
        int initial = nums.length - (k);
        for (int i = initial; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < initial; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

    }
}
