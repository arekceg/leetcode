package arrays.characterreplacement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CharacterReplacementTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments("AABABBAB", 1, 4),
                arguments("AZBABBXBYABBBBBHB", 2, 6),
                arguments("KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF", 4, 7),
                arguments("ABAB", 2, 4)
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnLongestStringOfRepeatingCharactersAfterCharacterReplacement(String s, int amountOfCharactersToReplace, int expectedResult) {
      // given

      // when
        final var updatedString = CharacterReplacement.characterReplacement(s, amountOfCharactersToReplace);

        // then
        assertEquals(expectedResult, updatedString);
    }
}