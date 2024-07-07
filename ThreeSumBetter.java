import java.util.*;
public class ThreeSumBetter{
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
//Giving TLE(Poor implementation)
// public static void threeSum(int[] nums) {
//        int n= nums.length;
//       List<List<Integer>> aList1=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             HashSet<Integer> hSet= new HashSet<>();
//             for(int j=i+1;j<n;j++){
//                  List<Integer> aList2 =  new ArrayList<>();
//                 int var=-(nums[i]+nums[j]);
//              if(hSet.contains(var)){
//                  aList2.add(nums[i]);
//                  aList2.add(nums[j]);
//                  aList2.add(-(nums[i]+nums[j]));
//                  Collections.sort(aList2);
//                  if(!aList1.contains(aList2)){
//                     aList1.add(aList2);
//                     }
//              }
//              hSet.add(nums[j]);
             
//             }
//         }
//         System.out.println(aList1);
//     }
//Better as Hash Set is used to check duplicate set in list.

public static void threeSum(int[] nums) {
       int n= nums.length;
      Set<List<Integer>> aList1 = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> hSet= new HashSet<>();
            for(int j=i+1;j<n;j++){
                int var=-(nums[i]+nums[j]);
             if(hSet.contains(var)){
                List<Integer> aList2 =  new ArrayList<>();
                 aList2.add(nums[i]);
                 aList2.add(nums[j]);
                 aList2.add(-(nums[i]+nums[j]));
                 Collections.sort(aList2);
                 aList1.add(aList2);
             }
             hSet.add(nums[j]);
             
            }
        }
        List<List<Integer>> ans = new ArrayList<>(aList1);
        System.out.println(ans);
    }
}
