package arrays.permuatations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        final var result = new ArrayList<List<Integer>>();
        final var current = new ArrayList<Integer>();
        calculatePermutations(nums, result, current);
        return result;
    }

    private static void calculatePermutations(int[] nums, ArrayList<List<Integer>> result, ArrayList<Integer> current) {
        if (current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for (int num : nums) {
            if (current.contains(num)){
                continue;
            }
            current.add(num);
            calculatePermutations(nums, result, current);
            current.remove(current.size() - 1);
        }
    }
}
