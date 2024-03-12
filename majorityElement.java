import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority element is: " + majorityEle(arr));
    }
        public  static int majorityEle(int[] nums) {
      int ctr=0, var=0;
      for(int i=0;i<nums.length;i++){
        if(ctr==0){
            ctr++;
            var=nums[i];
        }
        else if(var!=nums[i]){
            ctr--;
        }
        else if(var==nums[i]){
            ctr++;
        }
        
      } 
      return var; 
    }
}
