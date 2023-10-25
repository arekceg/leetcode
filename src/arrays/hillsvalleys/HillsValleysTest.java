package arrays.hillsvalleys;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class HillsValleysTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{2,4,1,1,6,5}, 3),
                arguments(new int[]{6,6,5,5,4,1}, 0)
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void hillsValleysTest(int[] array, int expectedCount) {
      // given
        assertEquals(expectedCount, HillsValleys.countHillValley(array));
        
      
      // when
      
      // then
    }
}