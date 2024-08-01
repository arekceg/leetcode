package arrays.plusminus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PlusMinusTest {
    
    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(List.of(1, 1, 0, -1 -1, 2))
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldPrintRatios(List<Integer> list) {
      // given
        PlusMinus.plusMinus(list);
      
      // when
      
      // then
    }

}