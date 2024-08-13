package arrays.duplicate;

import java.util.HashSet;

public class ContainsDuplicate_solution {
    public static boolean containsDuplicate(int[] nums) {
        final var numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)){
                return true;
            }
        }
        return false;
    }
}
