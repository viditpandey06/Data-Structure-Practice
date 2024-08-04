
import java.util.*;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, -8, 7, 6, 5, 4};
        for (int idx = 0; idx < arr.length; idx++) {
            bubbleSort(arr, 0);

        }
        System.out.println("Array is" + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int indx) {
        if (indx == arr.length - 1) {
            return;
        } else {
            if (arr[indx] > arr[indx + 1]) {
                int temp = arr[indx];
                arr[indx] = arr[indx + 1];
                arr[indx + 1] = temp;
            } else {

            }
            bubbleSort(arr, indx + 1);
        }
    }
}
