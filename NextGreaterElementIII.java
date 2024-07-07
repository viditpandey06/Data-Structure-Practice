import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n = 63684;
        nextGreaterElement(n);
        // System.out.println(nextGreaterElement(n));
    }

    public static void nextGreaterElement(int n) {
        int ctr =0;
        // if (n == 2147483647) {
        // return -1;
        // }

        String temp = Integer.toString(n);
        int len = temp.length()-1;
        int[] numbers1 = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            
            numbers1[i] = Character.getNumericValue(temp.charAt(i));
        }
        for (int i = len; i >=0; i--) {
             System.out.println(numbers1[i]);
            if (numbers1[i -1] > numbers1[i]) {
                ctr = i + 1;
                break;
            }
        }
        int temp1 = numbers1[ctr];
        numbers1[ctr] = numbers1[ctr + 1];
        numbers1[ctr + 1] = temp1;
        System.out.println(Arrays.toString(numbers1));
        temp = Arrays.toString(numbers1);
        System.out.println(temp);
        String s = new String(temp.substring(0,ctr+1));
        System.out.println(s);System.out.println(ctr);

    }
}