package integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberTest {

    static Stream<Arguments> palindromeNumberTestDataProvider() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false),
                Arguments.of(12321, true),
                Arguments.of(123, false)
        );
    }

    @ParameterizedTest(name = "Test isPalindrome with input: {0}")
    @MethodSource("palindromeNumberTestDataProvider")
    @DisplayName("Test isPalindrome method with various inputs")
    void testIsPalindrome(int input, boolean expected) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertEquals(expected, palindromeNumber.isPalindrome(input));
    }
}
