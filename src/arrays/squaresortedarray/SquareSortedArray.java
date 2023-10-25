package arrays.squaresortedarray;

public class SquareSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        final var resultArray = new int[nums.length];
        for (int i = resultArray.length - 1; i >= 0; i--) {
            final var leftSquare = nums[leftIndex] * nums[leftIndex];
            final var rightSquare = nums[rightIndex] * nums[rightIndex];
            if (rightSquare >= leftSquare ){
                resultArray[i] = rightSquare;
                rightIndex--;
            } else {
                resultArray[i] = leftSquare;
                leftIndex++;
            }
        }
        return resultArray;
    }
}
