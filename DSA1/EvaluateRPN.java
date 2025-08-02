package DSA1;

import java.util.Stack;

public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token)) stack.push(stack.pop() + stack.pop());
            else if ("-".equals(token)) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a - b);
            } else if ("*".equals(token)) stack.push(stack.pop() * stack.pop());
            else if ("/".equals(token)) {
                int b = stack.pop(), a = stack.pop();
                stack.push(a / b);
            } else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvaluateRPN erpn = new EvaluateRPN();
        System.out.println(erpn.evalRPN(new String[]{"2","1","+","3","*"}));  
        System.out.println(erpn.evalRPN(new String[]{"4","13","5","/","+"}));
}
}