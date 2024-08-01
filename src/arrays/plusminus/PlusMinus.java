package arrays.plusminus;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0, length = arr.size();
        for (Integer integer : arr) {
            if (integer < 0) {
                negativeCount++;
            } else if (integer > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        final var formatter = new DecimalFormat("0.000000");
        System.out.println(formatter.format((double) positiveCount / length));
        System.out.println(formatter.format((double) negativeCount / length));
        System.out.println(formatter.format((double) zeroCount / length));

    }
}
