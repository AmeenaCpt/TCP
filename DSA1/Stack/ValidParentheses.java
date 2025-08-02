package DSA1.Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        String input1 = "()[]{}";
        String input2 = "(]";
        String input3 = "([{}])";
        String input4 = "((()))";
        String input5 = "({[})";

        System.out.println(input1 + " → " + vp.isValid(input1)); // true
        System.out.println(input2 + " → " + vp.isValid(input2)); // false
        System.out.println(input3 + " → " + vp.isValid(input3)); // true
        System.out.println(input4 + " → " + vp.isValid(input4)); // true
        System.out.println(input5 + " → " + vp.isValid(input5)); // false
    }
}
