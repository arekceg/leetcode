package arrays.subsets;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        final var subsets = new ArrayList<List<Integer>>();
        final var currentSubset = new ArrayList<Integer>();
        searchForSubsets(0, nums, subsets, currentSubset);
        return subsets;
    }

    private static void searchForSubsets(int i, int[] nums, ArrayList<List<Integer>> subsets, ArrayList<Integer> currentSubset) {
        if (i >= nums.length){
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }
        currentSubset.add(nums[i]);
        searchForSubsets(i + 1, nums, subsets, currentSubset);

        currentSubset.remove(currentSubset.size() - 1);
        searchForSubsets(i + 1, nums, subsets, currentSubset);
    }
}
