import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int i = 0, j = s.length() - 1;
            while (i <= j) {
                if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                    if ((s.charAt(j) >= 48 && s.charAt(j) <= 57) || (s.charAt(j) >= 97 && s.charAt(j) <= 122)) {
                        if (s.charAt(i) == s.charAt(j)) {
                            i++;
                            j--;
                        } else {
                            return false;
                        }
                    } else {
                        j--;
                    }
                } else {
                    i++;
                }

            }
            return true;
        }
    }
