import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elemnts in array");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    
        public static int findMaxConsecutiveOnes(int[] arr) {
            int sum = 0, max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] + sum > sum) {
                    sum = sum + arr[i];
                } else {
                    if (max < sum) {
                        max = sum;
                        sum = 0;
                    } else {
                        sum = 0;
                    }
                }
                if (sum > max && i == arr.length - 1) {
                    max = sum;
                }
            }
            return max;
        }
    }
