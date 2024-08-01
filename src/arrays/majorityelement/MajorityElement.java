package arrays.majorityelement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        var majorityThreshold = nums.length / 2;
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            var currentNumCount = numCountMap.getOrDefault(num, 0);
            if (currentNumCount >= majorityThreshold){
                return num;
            }
            numCountMap.put(num, ++currentNumCount);
        }
        return 0;
    }
}
