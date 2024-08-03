package arrays.rotate;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int rotationPivot = k % nums.length;
        reverseAr(nums, 0, nums.length - 1);
        reverseAr(nums, 0, rotationPivot-1);
        reverseAr(nums, rotationPivot , nums.length - 1);
    }

    private static void reverseAr(int[] nums, int startIndex, int endIndex) {
        int l = startIndex, p = endIndex;
        while (l < p) {
            int temp = nums[l];
            nums[l] = nums[p];
            nums[p] = temp;
            l++;
            p--;
        }
    }
}
