package arrays.squaresortedarray;

public class SquareSortedArray {
    public static int[] sortedSquares(int[] nums) {
        var left = 0;
        var right = nums.length - 1;
        var squaredArray = new int[nums.length];
        var insertionIndex = squaredArray.length - 1;
        while (insertionIndex >= 0) {
            var leftSquare = squareInt(nums[left]);
            var rightSquare = squareInt(nums[right]);
            if (leftSquare > rightSquare) {
                squaredArray[insertionIndex--] = leftSquare;
                left++;
            } else {
                squaredArray[insertionIndex--] = rightSquare;
                right--;
            }
        }
        return squaredArray;
    }

    private static int squareInt(int num) {
        return num * num;
    }
}
