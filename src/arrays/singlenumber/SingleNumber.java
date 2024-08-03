package arrays.singlenumber;

import java.util.HashSet;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        var duplicatesValidator = new HashSet<Integer>();
        for (int num : nums) {
            if (!duplicatesValidator.add(num)) {
                duplicatesValidator.remove(num);
            }
        }
        return duplicatesValidator.iterator().next();
    }
}
