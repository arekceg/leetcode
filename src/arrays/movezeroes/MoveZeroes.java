package arrays.movezeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length - 1) {
            while (right < nums.length - 1 && nums[right] == 0) {
                right++;
            }
            while (nums[left] != 0 && left < right) {
                left++;
            }
            if (left == right) {
                right++;
                continue;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
    }
}
