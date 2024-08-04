
public class SkipCharacter {

    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        System.out.println(skipCharacter(s, "", 0, 'a'));
    }

    public static String skipCharacter(String s, String ans, int indx, char skipChar) {
        if (indx == s.length()) {
            return ans;
        } else {
            if (s.charAt(indx) == skipChar) {
                return skipCharacter(s, ans, indx + 1, skipChar);
            } else {
                ans += s.charAt(indx);
                return skipCharacter(s, ans, indx + 1, skipChar);
            }
        }
    }
}
