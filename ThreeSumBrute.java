import java.util.*;
public class ThreeSumBrute{
    public static void main(String[] args){
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
       
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        threeSum(arr);
}
public static void threeSum(int[] nums) {
        //unable to check duplicate set in list. 
        List<List<Integer>> aList1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                     List<Integer> aList2 = new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0&& i!=j&&j!=k&&k!=i){
                    aList2.add(nums[i]);
                    aList2.add(nums[j]);
                    aList2.add(nums[k]);
                   Collections.sort(aList2);
                   if(!aList1.contains(aList2))
                    aList1.add(aList2);
                    }

                }
            }
            
        }
        System.out.println("Unique triplets-"+aList1);
    }
}