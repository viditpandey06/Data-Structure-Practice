import java.util.Scanner;

public class secondLargest {
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
        System.out.println("Second largest element is: " + secondLargestElement(arr));
    }

    public static int secondLargestElement (int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            } else {
                continue;
            }
        }
        return secondLargest;
    }

}
