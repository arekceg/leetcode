package arrays.maxsubarray;

public class MaxSubArray {
    public static int maxSubArray(int[] sourceArray) {
        if (sourceArray.length < 1){
            return 0;
        }
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int number : sourceArray) {
            currentSum = Math.max(number, currentSum + number);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

/*
    -2  1   7   -4  5   1
C   -2  1   8   4   5   6
M   -2  1   8   8   8   8
 */
