import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,3,2,1,4};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            System.out.println(pivot+"_ "+ arr[pivot]+" _"+Arrays.toString(arr));
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i = i + 1;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }
}
