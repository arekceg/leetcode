package strings.ispalindrome;
// https://leetcode.com/problems/palindrome-number/description/
public class IsPalindrome_solution {
    public static boolean isPalindrome(int x) {
        final char[] intAsCharArray = String.valueOf(x).toCharArray();
        int forwardPointer = 0;
        int backwardsPointer = intAsCharArray.length - 1;

        while (forwardPointer <= backwardsPointer){
            if (intAsCharArray[forwardPointer++] != intAsCharArray[backwardsPointer--]){
                return false;
            }
        }
        return true;
    }
}
