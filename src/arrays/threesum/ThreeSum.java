package arrays.threesum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.sort;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> tripletsList = new ArrayList<>();
        sort(nums);
        int leftPointer = 0, rightPointer = nums.length - 1;
        for (int i = 0; i < nums.length - 2; i++) {
            final var currentNumber = nums[i];
            if (i > 0 && currentNumber == nums[i - 1]) {
                continue;
            }
            leftPointer = i + 1;
            while (leftPointer < rightPointer) {
                final var leftNumber = nums[leftPointer];
                final var rightNumber = nums[rightPointer];
                final var currentSum = currentNumber + leftNumber + rightNumber;
                if (currentSum == 0) {
                    tripletsList.add(List.of(currentNumber, leftNumber, rightNumber));
                    leftPointer++;
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer-1]){
                        leftPointer++;
                    }
                    rightPointer--;
                } else if (currentSum > 0) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
        }
        return tripletsList;
    }

    public static List<List<Integer>> threeSumSet(int[] nums) {
        final Set<List<Integer>> tripletsSet = new HashSet<>();
        sort(nums);
        int leftPointer = 0, rightPointer = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            final var currentNumber = nums[i];
            leftPointer = i + 1;
            while (leftPointer < rightPointer) {
                final var leftNumber = nums[leftPointer];
                final var rightNumber = nums[rightPointer];
                final var currentSum = currentNumber + leftNumber + rightNumber;
                if (currentSum == 0) {
                    tripletsSet.add(List.of(currentNumber, leftNumber, rightNumber));
                    leftPointer++;
                    rightPointer--;
                } else if (currentSum > 0) {
                    rightPointer--;
                } else {
                    leftPointer++;
                }
            }
        }
        return new ArrayList<>(tripletsSet);
    }
}
