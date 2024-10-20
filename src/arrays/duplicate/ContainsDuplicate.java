package arrays.duplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        var duplicateValidator = new HashSet<Integer>();
        for (int num : nums) {
            if (!duplicateValidator.add(num)){
                return true;
            }
        }
        return false;
    }
}
