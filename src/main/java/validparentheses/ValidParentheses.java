package validparentheses;

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses
{
    Stack<String> stack = new Stack<>();

    boolean isValid(String str) {
        char[] chars = str.toCharArray();
        for (char aChar : chars)
        {
            String s = String.valueOf(aChar);
            if (s.equals("(") || s.equals("{") || s.equals("[")) {
                stack.push(s);
            } else {
                if (stack.empty()) {
                    return false;
                }

                String last = stack.peek();
                if (s.equals(")") && last.equals("(")) {
                    stack.remove(last);
                }
                if (s.equals("}") && last.equals("{")) {
                    stack.remove(last);
                }
                if (s.equals("]") && last.equals("[")) {
                    stack.remove(last);
                }
            }
        }
        return stack.empty();
    }
}
