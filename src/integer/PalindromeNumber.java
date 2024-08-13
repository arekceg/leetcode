package integer;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
       int cachedInput = x;
        int reverse = 0;
        while (x > 0) {
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        return reverse == cachedInput;
    }
}
