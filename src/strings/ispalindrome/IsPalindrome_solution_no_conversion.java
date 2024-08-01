package strings.ispalindrome;

// https://leetcode.com/problems/palindrome-number/description/
public class IsPalindrome_solution_no_conversion {
    public static boolean isPalindrome(int x) {
        int lastDigit;
        long reverse = 0L;
        int temp = x;
        while (temp > 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return reverse == (long) x;
    }
}

