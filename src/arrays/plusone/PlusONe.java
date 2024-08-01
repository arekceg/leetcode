package arrays.plusone;

public class PlusONe {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            final var currentNumber = digits[i];
            if (currentNumber < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        final var ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

