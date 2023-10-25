package strings.ispalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @ParameterizedTest
    @CsvSource({
            "121, true" ,
            "10, false" ,
            "-121, false",
            "-1, false",
            "1, true",
            "1234567899, false",
            "0, true"})
    void test(int number, boolean expectedResult) {
        // given

        // when

        // then
        assertEquals(expectedResult, IsPalindrome.isPalindrome(number));
    }

    private void testPalindrome(int number, boolean expectedResult){
    }
}