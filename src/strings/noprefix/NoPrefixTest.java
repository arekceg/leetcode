package strings.noprefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NoPrefixTest {


    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(of("aab", "defgab", "abcde", "aabcde", "bbbbbbbbbb", "jabjjjad"), "aabcde"),
                arguments(of("abcd", "bcd", "abcde", "bcde"), "abcde"),
                arguments(of("aab", "aac", "aacghgh", "aabghgh"), "aacghgh"),
                arguments(of("6", "aab", "defgab", "abcde", "cedaaa", "bbbbbbbbbb", "jabjjjad"), null)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldCheckIfNoStringIsAPrefixOfAnotherOne(List<String> list, String expectedIncorrectString) {
        // given


        // when
        final var actualString = NoPrefix.noPrefix(list);
        // then
        assertEquals(expectedIncorrectString, actualString);
    }

}