package arrays.twosum;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final var complement = target - nums[i];
            final var complementInMap = complementMap.get(nums[i]);
            if (complementInMap != null) {
                return new int[]{complementInMap, i};
            }
            complementMap.put(complement, i);
        }
        return null;
    }
}
