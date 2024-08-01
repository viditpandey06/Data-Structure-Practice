public class FirstOccurance {

    public static void main(String[] args) {
        String needle = "vv";
        String haystack = "vv";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String h, String n) {
        int i = 0, j = 0;
        while (i <= h.length()) {
            if (j == n.length()) {
                return i - n.length();
            }
            if (h.charAt(i) == n.charAt(j)) {
                i++;
                j++;
            } else{
                i += 1;
                j = 0;
            }

        }
        return -1;
    }
}