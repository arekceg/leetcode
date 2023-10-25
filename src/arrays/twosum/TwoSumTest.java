package arrays.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static utils.Utils.printArray;

class TwoSumTest {

    @Test
    void test() {
        // given

        final var nums = new int[]{2,20, 10, 7, 11, 15};
        final var expected = new int[]{3,4};
        testArrays(nums, 18, expected);

    }

    void testArrays(int[] numbers, int sum, int[] expectedResult){
        // when
        final var actua = TwoSum.twoSum(numbers,  sum);

        // then
        printArray(expectedResult);
        System.out.println("\n==================");
        printArray(actua);
        assertArrayEquals(expectedResult, actua);

    }

}