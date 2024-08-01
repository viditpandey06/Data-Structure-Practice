
import java.util.Stack;

public class ValidParan {

    public static void main(String[] args) {
        String s = "((){{}})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char strChar = s.charAt(i);
            if (strChar == '(' || strChar == '[' || strChar == '{') {
                stack.push(strChar);
                //System.out.println(stack);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char stakChar = stack.peek();
                if (stakChar == '(' && strChar == ')') {
                    stack.pop();
                } else if (stakChar == '{' && strChar == '}') {
                    stack.pop();
                } else if (stakChar == '[' && strChar == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
