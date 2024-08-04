
import java.util.Arrays;

public class RecursiveSelectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, -5, -5, 4, 3, 2};
        selectionSort(arr, 0, 0, arr.length);
        System.out.println("Array is" + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int currIndx, int maxIndx, int itrt) {
        if (itrt == 0) {
            return;
        } else if (currIndx < itrt) {
            if (arr[currIndx] > arr[maxIndx]) {
                selectionSort(arr, currIndx + 1, currIndx, itrt);
            } else {
                selectionSort(arr, currIndx + 1, maxIndx, itrt);
            }
        } else {
            int temp = arr[itrt - 1];
            arr[itrt - 1] = arr[maxIndx];
            arr[maxIndx] = temp;
            //arr[swapIndx]=arr[maxIndx];
            selectionSort(arr, 0, 0, itrt - 1);
        }
    }

}
