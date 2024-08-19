package arrays.minimumrotated;

public class MinimumRotated {
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (
                    nums[mid] < nums[r]
            ) {
                // min is on the left
                r = mid;
            } else {
                // min is on the right
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
