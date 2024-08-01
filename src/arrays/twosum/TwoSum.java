package arrays.twosum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        var diffMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            var currentDiff = target - num;
            var diffIndexFromMap = diffMap.get(num);
            if (diffIndexFromMap != null) {
                return new int[]{diffIndexFromMap, i};
            }
            diffMap.put(currentDiff, i);
        }
        return null;
    }
}
