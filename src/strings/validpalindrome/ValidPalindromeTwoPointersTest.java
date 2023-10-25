package strings.validpalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class ValidPalindromeTwoPointersTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("A man, a plan, a canal: Panama", true),
                arguments("race a car", false),
                arguments(".,", true),
                arguments(" ", true),
                arguments("0P", false)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(String s, boolean isPalindrome) {
        // given
        assertEquals(isPalindrome, ValidPalindromeTwoPointers.isPalindrome(s));

        // when

        // then

    }
}