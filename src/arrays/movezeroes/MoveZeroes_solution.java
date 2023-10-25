package arrays.movezeroes;

public class MoveZeroes_solution {
    public static void moveZeroes(int[] nums) {
        int leftIndex = 0, rightIndex = 0;
        final var n = nums.length;
        while (rightIndex < n) {
            if (nums[leftIndex] != 0) {
                leftIndex++;
                rightIndex++;
            } else if (nums[rightIndex] == 0) {
                rightIndex++;
            } else {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
        }
    }
}

















