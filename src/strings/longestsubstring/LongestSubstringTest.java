package strings.longestsubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestSubstringTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments("abcbdbabc", 3),
                arguments("abcabcbb", 3),
                arguments("bbbb", 1),
                arguments("pwwkew", 3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnLongestSubstringWithNoRepeatingCharacters(String s, int expectedSubstringLength) {
      // given

      // when
        final var actualSubstringLength = LongestSubstring.lengthOfLongestSubstring(s);

        // then
        assertEquals(expectedSubstringLength, actualSubstringLength);
    }

}