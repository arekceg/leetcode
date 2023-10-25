package strings.longestpalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestPalindromeTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abccaccdad", 9),
                arguments("a", 1),
                arguments("aA", 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(String string, int expectedPalindromeLength) {
        // given
        assertEquals(expectedPalindromeLength, LongestPalindrome.longestPalindrome(string));

        // when

        // then

    }

}