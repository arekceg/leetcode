package arrays.search2dmatrix;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length - 1;
        // find row using binary serach
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (matrix[mid][matrix[0].length - 1] < target) {
                top = mid + 1;
            } else if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else {
                break;
            }
        }
        // binary search on row
        int left = 0, right = matrix[0].length - 1;
        int row = (top + bottom) / 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] > target) {
                right = mid - 1;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
