package arrays.threesum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.arguments(new int[]{0, 1, 1}, emptyList()),
                Arguments.arguments(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.arguments(new int[]{-2,0,0,2,2}, List.of(List.of(-2, 0, 2))),
                Arguments.arguments(new int[]{-2,0,1,1,2}, List.of(List.of(-2, 0, 2), List.of(-2, 1, 1))),
                Arguments.arguments(new int[]{1, 2, -2, -1}, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(int[] array, List<List<Integer>> expectedList) {
        // given
//        assertEquals(expectedList, ThreeSum_solution.threeSum(array));
        assertEquals(expectedList, ThreeSum.threeSum(array));

        // when

        // then

    }

//    @Test
//    void testTwoSum_found() {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int start = 0;
//        List<Integer> expected = List.of(1, 0);
//        assertEquals(expected, ThreeSum.twoSum(nums, target, start));
//    }
//
//    @Test
//    void testTwoSum_notFound() {
//        int[] nums = {2, 7, 11, 15};
//        int target = 10;
//        int start = 0;
//        List<Integer> expected = emptyList();
//        assertEquals(expected, ThreeSum.twoSum(nums, target, start));
//    }
//
//    @Test
//    void testTwoSum_withStartIndex() {
//        int[] nums = {1, 2, 3, 4, 5};
//        int target = 9;
//        int start = 2;
//        List<Integer> expected = List.of(4, 3);
//        assertEquals(expected, ThreeSum.twoSum(nums, target, start));
//    }
//
//    @Test
//    void testTwoSum_withNegativeNumbers() {
//        int[] nums = {-3, 4, 3, 90};
//        int target = 0;
//        int start = 0;
//        List<Integer> expected = List.of(2, 0);
//        assertEquals(expected, ThreeSum.twoSum(nums, target, start));
//    }
//
//    @Test
//    void testTwoSum_withDuplicates() {
//        int[] nums = {3, 3};
//        int target = 6;
//        int start = 0;
//        List<Integer> expected = List.of(1, 0);
//        assertEquals(expected, ThreeSum.twoSum(nums, target, start));
//    }
}