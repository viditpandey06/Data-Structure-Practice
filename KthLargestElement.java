import java.util.Arrays;
import java.util.Scanner;
public class KthLargestElement {
    public static void main(String[] args) {
        int size, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        k = sc.nextInt();
        quickSort(arr, 0, size - 1, k);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high, int k) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            System.out.println(pivot + "_ " + arr[pivot] + " _" + Arrays.toString(arr));
            if ((arr.length)-k == pivot) {
                System.out.println("Kth largest element is: " + arr[pivot]);
                return;
            }
            else if ( pivot < arr.length - k) {
                quickSort(arr, pivot + 1, high, k);
            } else  {
                quickSort(arr, low, pivot - 1, k);
            }
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
