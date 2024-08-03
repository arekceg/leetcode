package stacks.validparentheses;

import java.util.Map;
import java.util.Stack;

import static java.util.Map.entry;

public class ValidParan_solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (char x : arr) {

            if (x == '(')
                stack.push(')');
            else if (x == '[')
                stack.push(']');
            else if (x == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != x)
                return false;

        }
        return stack.isEmpty();
    }
}