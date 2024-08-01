package arrays.permuatations;

import java.util.ArrayList;
import java.util.List;

public class Permutations_solution {
    public static List<List<Integer>> permute(int[] nums) {
        final var allPermutations = new ArrayList<List<Integer>>();
        findPermutations(nums, new ArrayList<>(), allPermutations);
        return allPermutations;
    }

    private static void findPermutations(int[] nums, ArrayList<Integer> permutation, ArrayList<List<Integer>> allPermutations) {
        if (permutation.size() == nums.length) {
            allPermutations.add(new ArrayList<>(permutation));
            return;
        }
        for (int num : nums) {
            if (permutation.contains(num)) {
                continue;
            }
            permutation.add(num);
            findPermutations(nums, permutation, allPermutations);
            permutation.remove(permutation.size() - 1);
        }
    }
}
