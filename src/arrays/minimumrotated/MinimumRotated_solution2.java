package arrays.minimumrotated;

public class MinimumRotated_solution2 {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            var mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                // left portion
                if (nums[right] < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else {
                if (nums[right] < nums[left]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}
