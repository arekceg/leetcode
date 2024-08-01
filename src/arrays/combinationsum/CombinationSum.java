package arrays.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        final var result = new ArrayList<List<Integer>>();
        final var currentCombination = new ArrayList<Integer>();
        prepareCombinations(result, currentCombination, 0, candidates, target, 0);
        return result;
    }

    private static void prepareCombinations(ArrayList<List<Integer>> combinations, ArrayList<Integer> currentCombination,
                                     int index, int[] candidates, int target, int sumSoFar) {
        if (sumSoFar == target) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        if (index > candidates.length - 1){
            return;
        }
        final var currentNumber = candidates[index];
        currentCombination.add(currentNumber);
        sumSoFar += currentNumber;
        if (sumSoFar <= target) {
            prepareCombinations(combinations, currentCombination, index, candidates, target, sumSoFar);
            sumSoFar -= currentCombination.get(currentCombination.size() - 1);
            currentCombination.remove(currentCombination.size() - 1);
            prepareCombinations(combinations, currentCombination, index + 1, candidates, target, sumSoFar);
        }
    }
}
