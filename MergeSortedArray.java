
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, nums1.length, nums2, nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - n-1;
        int j = n - 1;
        int indx = nums1.length - 1;
        while (i >= 0 || j >= 0) {
            if (j >= 0 && (i < 0 || nums1[i] < nums2[j])) {
                nums1[indx] = nums2[j];
                j--;
            } else if (i >= 0 && (j < 0 || nums1[i] >= nums2[j])) {
                nums1[indx] = nums1[i];
                i--;
            }
            indx--;
        }
    }
}
