package arrays.duplicate;

import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ContainsDuplicate {
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
