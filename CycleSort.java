import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elemnts in array");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void cycleSort(int [] nums){
        int i=0;
        int ctrIndx=0;
        while (i<nums.length) {
             ctrIndx=nums[i];
             // [9,6,4,2,3,5,7,0,1]
             if(nums[i]!=i && nums[i]<nums.length){
                    int temp=nums[i];
                    nums[i]=nums[ctrIndx];
                    nums[ctrIndx]=temp;
             }
             
             else{
                i++;
             }
        }
    } 
}
