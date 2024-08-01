package arrays.rotate;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);

    }

    private static void reverseArray(int[] nums, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            final var temp = nums[rightIndex];
            nums[rightIndex] = nums[leftIndex];
            nums[leftIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}
