package arrays.removelement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int insertionIndex = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != val) {
                nums[insertionIndex++] = num;
                count++;
            }
        }
        return count;
    }
}
