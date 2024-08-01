package stacks.reversepolishnotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReversePolishNotationTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new String[]{"2","1","+","3","*"}, 9),
                arguments(new String[]{"4","13","5","/","+"}, 6),
                arguments(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}, 22),
                arguments(new String[]{"18"}, 18)
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldCalculateRPN(String[] tokens, int expectedResult) {
      // given

      // when
        final var actualResult = ReversePolishNotation.evalRPN(tokens);

        // then
        assertEquals(expectedResult, actualResult);
    }
}