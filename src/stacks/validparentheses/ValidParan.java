package stacks.validparentheses;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParan {
    private static final Map<Character, Character> closedToOpenBracketMap =
            Map.of(
                    ')', '(',
                    '}', '{',
                    ']', '['
            );

    private static final Set<Character> closingBrackets = closedToOpenBracketMap.keySet();
    private static final Collection<Character> openingBrackets = closedToOpenBracketMap.values();

    public static boolean isValid(String s) {
        if (isClosingBracket(s.charAt(0)) || isOpeningBracket(s.charAt(s.length() - 1))) {
            return false;
        }
        var bracketValidator = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (isClosingBracket(bracket)) {
                if (!bracketValidator.isEmpty() && !bracketValidator.peek().equals(closedToOpenBracketMap.get(bracket))) {
                    return false;
                } else if (!bracketValidator.isEmpty()) {
                    bracketValidator.pop();
                    continue;
                }
            }
            bracketValidator.push(bracket);
        }
        return bracketValidator.isEmpty();
    }

    private static boolean isOpeningBracket(Character c) {
        return openingBrackets.contains(c);
    }

    private static boolean isClosingBracket(Character c) {
        return closingBrackets.contains(c);
    }
}
