import java.util.Scanner;

public class SortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));         
    }
    public static boolean check(int [] nums){
        int ctr = 0, i = 0;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ctr++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            ctr++;
        }

        if (ctr < 2) {
            return true;
        } else {
            return false;
        }
    }
}
