public class LengthofString {
    public static void main(String[] args) {
        String s = "1234" + "\n";
        System.out.println(lengthString(s, 0));
    }

    public static int lengthString(String s, int i) {
        int ctr = 1;
        if (s.charAt(i) == '\n') {
            return 0;
        } else {
            return ctr + lengthString(s, i + 1);

        }
    }
}
