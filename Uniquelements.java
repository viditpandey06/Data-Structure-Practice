import java.util.*;

public class Uniquelements {
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
        System.out.println("Unique elements in the array are: ");
        uniqueElements(arr);
    }

    public static void uniqueElements(int[] arr) {
        int ptr1 = 0, ptr2 = 1;
        while (ptr2 < arr.length) {
            if (arr[ptr1] == arr[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
                arr[ptr1] = arr[ptr2];
                ptr2++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, ptr1 + 1)));
    }
}
