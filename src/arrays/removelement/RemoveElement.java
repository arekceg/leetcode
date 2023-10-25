package arrays.removelement;

// https://leetcode.com/problems/remove-element/description
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int insertionIndex = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[insertionIndex++] = nums[i];
            } else {
                count++;
            }
        }
        return count;
    }
}
