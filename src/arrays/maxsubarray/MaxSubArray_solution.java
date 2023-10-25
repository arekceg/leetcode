package arrays.maxsubarray;

import static java.lang.Integer.MIN_VALUE;

// https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubArray_solution {

    public static int maxSubArray(int[] nums) {
        int leftPointer = 0;
        int rightPointer = 0;
        int currentMax = MIN_VALUE;
        int sum = 0;
        while (rightPointer < nums.length) {
            sum += nums[rightPointer];
            while (sum > currentMax) {
                sum -= nums[leftPointer++];
                currentMax = Math.max(sum, currentMax);
            }
            rightPointer++;
        }
        return currentMax;
    }

    public static int[] subArrayWithSumAndLength(int[] array, int expectedSum, int length) {
//        int rightIndex = 0;
//        int leftIndex = 0;
//        for (int leftIndex = 0; leftIndex < array.length - length; leftIndex++) {
//
//        }
        return new int[]{};
    }
}