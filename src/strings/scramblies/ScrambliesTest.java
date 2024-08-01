package strings.scramblies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesTest {


    @ParameterizedTest
    @CsvSource({"'', '', true",
            "'', 'abc', false",
            "'abc', '', false",
            "'abc', 'abc', true",
            "'abc', 'xyz', false",
            "'aabbcc', 'abc', true",
            "'aabbcxyz', 'abc', true",
            "'aabbcc', 'xyz', false"
    })
    public void shouldReturnExpectedResult(String str1, String str2, boolean expectedResult) {
        // when
        boolean result = Scramblies.scramble(str1, str2);

        // then
        assertEquals(expectedResult, result);
    }
}