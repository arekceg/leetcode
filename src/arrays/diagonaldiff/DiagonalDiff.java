package arrays.diagonaldiff;

import java.util.List;

public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRightSum = 0,
                rightToLeftSum = 0,
                leftPointer = 0,
                rightPointer = arr.get(0).size() - 1;
        for (List<Integer> integers : arr) {
            leftToRightSum += integers.get(leftPointer++);
            rightToLeftSum += integers.get(rightPointer--);
        }
        return Math.abs(leftToRightSum - rightToLeftSum);
    }
}
