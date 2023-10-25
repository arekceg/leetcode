package strings.longestpalindrome;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        final var chars = s.toCharArray();
        var maxPalindromeLength = 0;
        for (char c : chars) {
            if (charSet.contains(c)) {
                maxPalindromeLength += 2;
                charSet.remove(c);
            } else {
                charSet.add(c);
            }
        }
        if (charSet.size() > 0) {
            maxPalindromeLength++;
        }
        return maxPalindromeLength;
    }
}
