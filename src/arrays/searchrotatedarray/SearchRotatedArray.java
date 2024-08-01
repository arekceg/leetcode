package arrays.searchrotatedarray;

public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[left] ){
                // we're in the left portion
                if (target > nums[mid] || target < nums[left]){
                    left = mid +1;
                } else {
                    right = mid -1;
                }
            } else {
                // right portion
                if (target < nums[mid] || target > nums[right]){
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
    // [4,5,6,7,0,1,2]
}
