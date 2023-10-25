package arrays.hillsvalleys;

public class HillsValleys {
    public static int countHillValley(int[] nums) {
        int count = 0;
        int leftPointer = 0;
        int rightPointer = 1;
        while (rightPointer < nums.length - 1) {
            final var leftValue = nums[leftPointer];
            final var rightValue = nums[rightPointer];
            if (leftValue < rightValue && rightValue > nums[rightPointer + 1] // hill
                    ||
                    leftValue > rightValue && rightValue < nums[rightPointer + 1]) { // valley
                count++;
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        return count;
    }
}
