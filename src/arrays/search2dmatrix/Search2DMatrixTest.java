package arrays.search2dmatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Search2DMatrixTest {
    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[][]{
                                {1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60},},
                        3,
                        true
                ),
                arguments(new int[][]{
                                {1},
                                {3},},
                        0,
                        false
                ),
                arguments(new int[][]{
                                {1, 3, 5, 7},
                                {10, 11, 12, 14},
                                {15, 18, 19, 20},
                                {23, 30, 34, 60},},
                        13,
                        false
                ),
                arguments(new int[][]{
                                {1, 3, 5, 7},
                                {10, 11, 16, 20},
                                {23, 30, 34, 60},},
                        13,
                        false
                ),
                arguments(new int[][]{
                                {1, 3}},
                        3,
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void search2DMatrixTest(int[][] matrix, int target, boolean expectedResult) {
        // given
        assertEquals(expectedResult, Search2DMatrix.searchMatrix(matrix, target));

        // when

        // then
    }
}