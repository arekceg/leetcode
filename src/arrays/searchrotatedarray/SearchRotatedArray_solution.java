package arrays.searchrotatedarray;

public class SearchRotatedArray_solution {
    /*
    1. Check if we're in the right or left sorted part of array
        M > L => R else L
    2. If we're in Right sorted part:
        M > T || T > R => L
    3. If we're in the Left sorted part
        T > M || T < L => R
    */

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}