package arrays.search2dmatrix2;

// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class Search2DMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length - 1 && col >= 0) {
            final var currentNumber = matrix[row][col];
            if (currentNumber == target) {
                return true;
            }
            if (currentNumber > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
