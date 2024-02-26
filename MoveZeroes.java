import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
        public static void moveZeroes(int[] nums) {
            int i = 0, j = 0;
            while (i < nums.length && j < nums.length) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                } else if (nums[i] == 0 && nums[j] == 0) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }
    }