package arrays.mergesortedarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class MergeSortedArrayTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void merge(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        System.out.println(Arrays.toString(nums1));
        MergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(expected, nums1);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{5, 7, 8, 0, 0, 0, 0}, 3, new int[]{4, 5, 6, 10}, 4, new int[]{4, 5, 5, 6, 7, 8, 10}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2})
        );
    }
}