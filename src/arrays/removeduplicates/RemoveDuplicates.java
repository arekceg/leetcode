package arrays.removeduplicates;

import jdk.jshell.spi.ExecutionControl;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int insertionIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != nums[i - 1]){
                nums[insertionIndex++] = num;
            }
        }
        return insertionIndex;
    }
}
