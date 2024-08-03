package arrays.search2dmatrix;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        if (target < matrix[0][0] || matrix[matrix.length - 1][matrix[0].length - 1] < target) {
            return false;
        }
        while (low <= high) {
            var mid = low + (high - low) / 2;
            if (matrix[low][0] <= target && matrix[low][matrix[low].length - 1] >= target) {
                int row = low;
                low = 0;
                high = matrix[low].length - 1;
                // binary search row
                while (low <= high) {
                    mid = (high + low) / 2;
                    if (matrix[row][mid] > target) {
                        high = mid - 1;
                    } else if (matrix[row][mid] < target) {
                        low = mid + 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
            // binary serach columns
            if (matrix[mid][0] > target) {
                high = mid;
            } else if (matrix[mid][0] < target) {
                low = mid;
            } else {
                return true;
            }
        }
        return false;
    }
}
