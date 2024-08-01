package linkedlist.findduplicate;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slowPointer = nums[0];
        int fastPointer = nums[nums[0]];
        while (fastPointer != slowPointer) {
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        }

        slowPointer = 0;
        while (slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        return slowPointer;
    }
}
