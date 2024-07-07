import java.util.Scanner;

public class SubarraySumEqualK { // Remove extra closing parenthesis

    public static int subarraySum(int[] nums, int k) {
        int ctr = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int j = i;
            while (j < nums.length) {
                sum = sum + nums[j];
                if (sum == k) {
                    ctr++;
                }
                j++;
            }
        }
        return ctr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] nums = new int[size];

        // Get the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Get the target sum
        System.out.print("Enter the target sum: ");
        int k = scanner.nextInt();

        // Call the subarraySum method
        int result = subarraySum(nums, k);

        // Print the result
        System.out.println("Number of subarrays with sum equal to " + k + ": " + result);

        scanner.close();
    }
}
