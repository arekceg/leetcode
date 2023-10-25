package arrays.majorityelement;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> intToCountMap = new TreeMap<>();
        final var majorityThreshold = nums.length / 2;
        for (int num : nums) {
            intToCountMap.put(num, intToCountMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : intToCountMap.entrySet()) {
            if (entry.getValue() > majorityThreshold) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("No majority found");
    }
}
