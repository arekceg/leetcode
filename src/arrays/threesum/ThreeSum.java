package arrays.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            while (j < r) {
                var currentSum = nums[i] + nums[j] + nums[r];
                if (currentSum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[r]));
                    j++;
                    while (nums[j] == nums[j - 1] && j < r) {
                        j++;
                    }
                } else if (currentSum > 0) {
                    r--;
                } else {
                    j++;
                }

            }
        }
        return result;
    }
}
