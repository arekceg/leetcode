package arrays.search2dmatrix;

public class Search2DMatrix_solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = 0, colIndex = matrix[0].length - 1;
        while (rowIndex < matrix.length && colIndex >= 0) {
            final var currentNumber = matrix[rowIndex][colIndex];
            if (currentNumber == target) {
                return true;
            }
            if (currentNumber > target) {
                colIndex--;
            } else {
                rowIndex++;
            }
        }
        return false;
    }

    public static boolean searchMatrixSlow(int[][] matrix, int target) {
        int bottomPointer = matrix.length - 1, topPointer = 0;
        while (topPointer <= bottomPointer) {
            if (bottomPointer - topPointer <= 1) {
                final var bottomMatrix = matrix[bottomPointer];
                final var topMatrix = matrix[topPointer];
                if (
                        bottomMatrix[0] <= target &&
                                bottomMatrix[bottomMatrix.length - 1] >= target
                ) {
                    return binarySearch(bottomMatrix, target) != -1;
                } else {
                    return binarySearch(topMatrix, target) != -1;
                }
            }
            int midPointer = (bottomPointer + topPointer) / 2;
            final var midArray = matrix[midPointer];
            final var midArrayFirstNumber = midArray[0];
            if (midArrayFirstNumber > target) {
                bottomPointer--;
            } else if (midArrayFirstNumber < target) {
                topPointer++;
            } else if (midArray[midArray.length - 1] >= target) {
                return true;
            }
        }
        return false;
    }

    private static int binarySearch(int[] nums, int target) {
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
}
