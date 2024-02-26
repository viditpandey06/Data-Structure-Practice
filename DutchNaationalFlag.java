import java.util.Arrays;
import java.util.Scanner;
public class DutchNaationalFlag {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[]nums){
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else{
                System.out.println("Invalid input");
                return;
            }
        }
    }
}
