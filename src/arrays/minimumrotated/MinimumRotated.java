package arrays.minimumrotated;

public class MinimumRotated {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (high - low > 1) {
            int mid = low + (high - low) / 2;
            if (nums[low] > nums[high] && nums[mid] > nums[low]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return Math.min(nums[high], nums[low]);
    }
}
