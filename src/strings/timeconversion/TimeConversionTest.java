package strings.timeconversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TimeConversionTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments("07:30:30PM", "19:30:30"),
                arguments("07:30:30AM", "07:30:30"),
                arguments("12:05:30AM", "00:05:30"),
                arguments("01:30:30PM", "13:30:30"),
                arguments("12:01:01PM", "12:01:01")
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldConvertTimeToMilitary(String input, String expectedTime) {
      // given

      // when
        final var actualTime = TimeConversion.timeConversion(input);

        // then
        assertEquals(expectedTime, actualTime);
    }
}