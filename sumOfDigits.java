/**
 * The "sumOfDigits" class calculates the sum of the digits of a given number recursively.
 */

public class sumOfDigits {
    public static void main(String[] args) {

        System.out.println(sum(1234));
    }

/**
 * The function calculates the sum of the digits of a given number recursively.
 * 
 * @param n The parameter "n" represents a long integer value.
 * @return The method is returning the sum of the digits of the given number.
 */
    public static long sum(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + (sum(n / 10));
        }
    }
}
