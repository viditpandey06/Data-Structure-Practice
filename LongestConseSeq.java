import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class LongestConseSeq {
    public static void main(String[] args) {
        //System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter the elements of the array");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = { 0, 3, 7, 2, 5,5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));
    }
   

    public static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int currentNum = i;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}
