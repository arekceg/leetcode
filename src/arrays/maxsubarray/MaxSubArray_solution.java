package arrays.maxsubarray;

import static java.lang.Integer.MIN_VALUE;

// https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubArray_solution {

    public static int maxSubArray(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int integer : arr) {
            currentSum = Math.max(currentSum + integer, integer);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
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