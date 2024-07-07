import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class LeaderOfArray{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        leader(ans,arr);
        System.out.println(ans);
    }
    public static void leader(List<Integer> ans, int[] arr){
        int reqMax=arr[arr.length-1];
        ans.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=reqMax){
                ans.add(arr[i]);
                reqMax=arr[i];
            }
        }
    }
}