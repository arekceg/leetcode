package strings.ispalindrome;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (temp != 0){
            final var modulo = temp % 10;
            reverse = reverse * 10 + modulo;
            temp /= 10;
        }

        return reverse == x;
    }
}
