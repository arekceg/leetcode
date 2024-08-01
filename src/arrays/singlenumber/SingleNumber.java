package arrays.singlenumber;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        var result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
