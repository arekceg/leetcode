package strings.validparentheses;

import java.util.Map;
import java.util.Stack;

import static java.util.Map.entry;

public class ValidParan {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        final var pairsMap = Map.ofEntries(
                entry('(', ')'),
                entry('{', '}'),
                entry('[', ']'));
        final var chars = s.toCharArray();
        final var stringStartsWithClosingP = pairsMap.get(chars[0]) == null;
        final var stringEndsWithOpeningP = pairsMap.get(chars[chars.length - 1]) != null;
        if (stringStartsWithClosingP || stringEndsWithOpeningP) {
            return false;
        }
        final var openParenthesisStack = new Stack<Character>();
        for (char parenthesis : chars) {
            final var matchingClosingParenthesis = pairsMap.get(parenthesis);
            final var currentParenthesisIsOpen = matchingClosingParenthesis != null;
            if (currentParenthesisIsOpen) {
                openParenthesisStack.push(parenthesis);
            } else {
                if (openParenthesisStack.isEmpty()){
                    return false;
                }
                final var closedParenthesisMatchesTheLastOpenOne = pairsMap.get(openParenthesisStack.peek()).equals(parenthesis);
                if (closedParenthesisMatchesTheLastOpenOne) {
                    openParenthesisStack.pop();
                } else {
                    return false;
                }
            }
        }
        return openParenthesisStack.isEmpty();
    }

}