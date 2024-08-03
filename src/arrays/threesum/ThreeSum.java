package arrays.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var sums = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            final var currentNumber = nums[i];
            if (i > 0 && currentNumber == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                var currentSum = nums[left] + nums[right] + currentNumber;
                if (currentSum == 0) {
                    sums.add(new ArrayList<>(List.of(currentNumber, nums[left], nums[right])));
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                } else if (currentSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return sums;
    }

    public static List<List<Integer>> twoSum(int[] nums, int currentNumber, int start) {
        var sums = new ArrayList<List<Integer>>();
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            var currentSum = nums[left] + nums[right] + currentNumber;
            if (currentSum == 0) {
                sums.add(new ArrayList<>(List.of(nums[left], nums[right], currentNumber)));
                left++;
                while (nums[left] == nums[left - 1] && left < right) {
                    left++;
                }
                right--;
            }
            if (currentSum > 0) {
                right--;
            } else {
                left++;
            }
        }
        return sums;
    }
}
