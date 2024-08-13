package arrays.binarysearch;

public class BinarySearch_solution {
    public static int searchRecursive(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        return findTarget(nums, target, leftIndex, rightIndex);
    }

    public static int binarySearch(int[] nums, int target) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            final var currentNumber = nums[midIndex];
            if (currentNumber < target) {
                leftIndex++;
            } else if (currentNumber > target) {
                rightIndex--;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    private static int findTarget(int[] nums, int target, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 1) {
            if (nums[leftIndex] == target) {
                return leftIndex;
            } else if (nums[rightIndex] == target) {
                return rightIndex;
            } else {
                return -1;
            }
        }
        int halfArrayIndex = (leftIndex + rightIndex) / 2;
        if (nums[halfArrayIndex] > target) {
            return findTarget(nums, target, leftIndex, halfArrayIndex);
        } else if (nums[halfArrayIndex] < target) {
            return findTarget(nums, target, halfArrayIndex, rightIndex);
        } else if (nums[halfArrayIndex] == target) {
            return halfArrayIndex;
        }
        return -1;
    }
}
