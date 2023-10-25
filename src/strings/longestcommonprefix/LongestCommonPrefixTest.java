package strings.longestcommonprefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.arguments(new String[]{"dog","racecar","car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(String[] strings, String expectedPrefix) {
        // given
        assertEquals(expectedPrefix, LongestCommonPrefix.longestCommonPrefix(strings));

        // when

        // then

    }
}