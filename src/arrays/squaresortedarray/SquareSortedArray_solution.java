package arrays.squaresortedarray;

public class SquareSortedArray_solution {
    public static int[] sortedSquares(int[] nums) {
        final var squareArray = new int[nums.length];
        int leftIndex = 0, rightIndex = nums.length - 1, insertionIndex = nums.length - 1;
        while (leftIndex <= rightIndex){
            final var leftIndexNumberSquared = nums[leftIndex] * nums[leftIndex];
            final var rightIndexNumberSquared = nums[rightIndex] * nums[rightIndex];
            if (leftIndexNumberSquared >= rightIndexNumberSquared) {
                squareArray[insertionIndex--] = leftIndexNumberSquared;
                leftIndex++;
            } else {
                squareArray[insertionIndex--] = rightIndexNumberSquared;
                rightIndex--;
            }
        }
//        while (leftIndex >= 0) {
//            squareArray[insertionIndex++] = nums[leftIndex] * nums[leftIndex];
//            leftIndex--;
//        }
//        while (rightIndex < nums.length) {
//            squareArray[insertionIndex++] = nums[rightIndex] * nums[rightIndex];
//            rightIndex++;
//        }
        return squareArray;
    }

    private static int findArrayMidpoint(int[] nums) {
        int midPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                midPoint = i;
                System.out.println("Array midpoint = " + midPoint);
                break;
            }
        }
        return midPoint;
    }
}
