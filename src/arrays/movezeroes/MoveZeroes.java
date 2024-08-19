package arrays.movezeroes;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        while (r <= nums.length - 1 && l <= r) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                var temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
                r++;
            }
        }
    }
}
