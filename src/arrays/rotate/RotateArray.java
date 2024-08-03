package arrays.rotate;


public class RotateArray {

    public static void rotate(int[] nums, int k) {

//        rotateOn(nums, k);
        rotateO1(nums, k);
    }

    private static void rotateO1(int[] nums, int k) {
        var pivotIndex = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, pivotIndex);
        reverse(nums, pivotIndex + 1, nums.length - 1);

    }

    private static void reverse(int[] nums, int i, int length) {

    }


    private static void rotateOn(int[] nums, int k) {
        var rotatedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            var newIndex = findNewIndex(nums, i, k);
            rotatedArray[newIndex] = nums[i];
        }
        System.arraycopy(rotatedArray, 0, nums, 0, rotatedArray.length);
    }

    private static int findNewIndex(int[] nums, int currentIndex, int rotation) {
        return (currentIndex + rotation) % nums.length;
    }
}



/*             0 1 2 3 4 5 6
Input: nums = [1,2,3,4,5,6,7], k = 3
               3 4 5 6 1 2 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */