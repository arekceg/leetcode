package stacks.reversepolishnotation;

import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        final var calculationStack = new Stack<String>();
        for (String token : tokens) {
            switch (token) {
                case "*" -> {
                    int secondInt = parseInt(calculationStack.pop());
                    int firstInt = parseInt(calculationStack.pop());
                    calculationStack.push(valueOf(firstInt * secondInt));
                }
                case "+" -> {
                    int secondInt = parseInt(calculationStack.pop());
                    int firstInt = parseInt(calculationStack.pop());
                    calculationStack.push(valueOf(firstInt + secondInt));
                }
                case "-" -> {
                    int secondInt = parseInt(calculationStack.pop());
                    int firstInt = parseInt(calculationStack.pop());
                    calculationStack.push(valueOf(firstInt - secondInt));
                }
                case "/" -> {
                    int secondInt = parseInt(calculationStack.pop());
                    int firstInt = parseInt(calculationStack.pop());
                    calculationStack.push(valueOf(firstInt / secondInt));
                }
                default -> calculationStack.push(token);
            }
        }
        return parseInt(calculationStack.pop());
    }
}
