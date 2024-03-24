public class ReaarangeBySign {
    public static void main(String[] args) {
        System.out.println("Rearrange by sign");
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        rearrange(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rearrange(int[] arr) {
        int[] postive = new int[arr.length / 2];
        int[] negative = new int[arr.length / 2];
        int pos = 0, neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative[neg] = arr[i];
                neg++;
            } else {
                postive[pos] = arr[i];
                pos++;
            }
        }
        int i = 0;
        pos = 0;
        neg = 0;

        while (pos < arr.length / 2 && neg < arr.length / 2) {
            arr[i] = postive[pos];
            i++;
            arr[i] = negative[neg];
            i++;
            pos++;
            neg++;

        }

    }
}