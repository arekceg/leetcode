package arrays.removeduplicates;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int insertionIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertionIndex] = nums[i];
                insertionIndex++;
            }
        }
        return insertionIndex;
    }
}
