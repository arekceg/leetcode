package arrays.minimumrotated;

public class MinimumRotated {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] < nums[right]){
                return nums[left];
            }
            if (right - left == 1){
                break;
            }
            int mid = (right + left) / 2;
            if (nums[left] < nums[mid]) {
                left = mid ;
            } else {
                right = mid ;
            }
        }
        return Math.min(nums[left], nums[right]);
    }
}

