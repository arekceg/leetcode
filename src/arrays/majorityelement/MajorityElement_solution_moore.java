package arrays.majorityelement;

public class MajorityElement_solution_moore {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                candidate = num;
            }

        }
        return candidate;
    }
}
