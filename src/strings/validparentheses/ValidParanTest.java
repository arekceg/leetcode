package strings.validparentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidParanTest {


    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("){}{}", false),
                arguments("{}{}(", false),
                arguments("{{{}}}({{}})[[(())]]", true),
                arguments("{{(}}){{(}})[[(]])", false),
                arguments("{", false),
                arguments("()[]", true),
                arguments("()", true),
                arguments("{{(()(()({}[]{}}}{", false),
                arguments("[[[]", false),
                arguments("()))", false)

        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(String string, boolean expectedResult) {
        // given
        assertEquals(expectedResult, ValidParan.isValid(string));

        // when

        // then

    }
}