package arrays.majorityelement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static arrays.majorityelement.MajorityElement.majorityElement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MajorityElementTest {

    public static Stream<Arguments> testDataProvider() {
        return Stream.of(
                arguments(new int[]{3, 2, 3}, 3),
                arguments(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                arguments(new int[]{2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "testDataProvider")
    void majorityElementTest(int[] array, int expectedMajority) {
        // given
        assertEquals(expectedMajority, majorityElement(array));

        // when

        // then

    }

}