package arrays.minmaxsum;

import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long wholeArraySum = 0;
        final Integer[] inputAsArray = arr.toArray(new Integer[0]);
        Arrays.sort(inputAsArray);
        for (Integer integer : inputAsArray) {
            wholeArraySum += integer;
        }
        final var maxSum = wholeArraySum - inputAsArray[0];
        final var minSum = wholeArraySum - inputAsArray[inputAsArray.length - 1];
        System.out.println(minSum + " " + maxSum);
    }
}
