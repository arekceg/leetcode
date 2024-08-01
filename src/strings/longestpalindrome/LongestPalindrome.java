package strings.longestpalindrome;

import java.util.HashSet;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        var palindromeValidator = new HashSet<Character>();
        var maxPalindromeLength = 0;
        for (char c : s.toCharArray()) {
            if (!palindromeValidator.add(c)) {
                palindromeValidator.remove(c);
                maxPalindromeLength += 2;
            }
        }
        if (!palindromeValidator.isEmpty()){
            maxPalindromeLength++;
        }
        return maxPalindromeLength;
    }
}
