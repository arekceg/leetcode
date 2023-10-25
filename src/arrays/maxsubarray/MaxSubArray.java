package arrays.maxsubarray;

// https://leetcode.com/problems/maximum-subarray/description/
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int maxSum = 0; int tempSum = 0;
        for (int i = 0; i < nums.length; i++) {
            final var currentNumber = nums[i];
            tempSum = Math.max(currentNumber, tempSum + currentNumber);
            maxSum = Math.max(tempSum, maxSum);
        }
        return maxSum;
    }
}