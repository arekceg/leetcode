package arrays.binarysearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        var l = 0;
        var r = nums.length - 1;
        while (l <= r) {
            var mid = (r + l)/2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
