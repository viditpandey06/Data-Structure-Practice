
public class HappyString {
   public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.getHappyString(1, 3));
   }
   
    
    
}

class Solution {
    public String getHappyString(int n, int k) {
        return HappyString("", n, k, 0, ' ', 1);
    }

    public String HappyString(String s, int n, int k, int indx, char lastChar, int ctr) {
        String temp = "abc";
        if (s.length() == n) {
            if (ctr == k) {
                return s;
            } else {
                return HappyString(s, n, k, 0, ' ', ctr + 1);
            }
        } else {
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) != lastChar) {
                    String newS = s + temp.charAt(i);
                    String result = HappyString(newS, n, k, i, temp.charAt(i), ctr);
                    if (!result.isEmpty()) {
                        return result;
                    }
                }
            }
        }
        return "";
    }
}