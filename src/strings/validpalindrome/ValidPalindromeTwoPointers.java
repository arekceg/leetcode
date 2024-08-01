package strings.validpalindrome;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import static java.lang.Character.toLowerCase;

public class ValidPalindromeTwoPointers {
    public static boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        final var chars = s.toCharArray();
        while (leftPointer < rightPointer) {
            while (isNotAlphanumeric(chars[leftPointer]) && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (isNotAlphanumeric(chars[rightPointer]) && rightPointer > leftPointer) {
                rightPointer--;
            }
            if (toLowerCase(chars[leftPointer]) != toLowerCase(chars[rightPointer])) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    private static boolean isNotAlphanumeric(char c) {
        return !isAlphabetic(c) && !isDigit(c);
    }
}
