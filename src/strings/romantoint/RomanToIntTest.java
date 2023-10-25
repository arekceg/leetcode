package strings.romantoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    @Test
    void test() {
        // given
        testConverter("III", 3);
        testConverter("LVIII", 58);
        testConverter("MCMXCIV", 1994);
        testConverter("MCCXCIV", 1294);
        fast("MCMXCIV", 1994);

        // when

        // then

    }


    public void testConverter(String roman, int expectedResult){
        final var actualInt = RomanToInt.romanToIntBackwards(roman);
        System.out.println("ROMAN : " + roman);
        System.out.println("EXPECTED INT : " + expectedResult);
        System.out.println("ACTUAL INT : " + actualInt);
        assertEquals(expectedResult, actualInt);
    }

    public void fast(String roman, int expectedResult){
        final var actualInt = RomanToInt.romanToIntBackwards(roman);
        System.out.println("ROMAN : " + roman);
        System.out.println("EXPECTED INT : " + expectedResult);
        System.out.println("ACTUAL INT : " + actualInt);
        assertEquals(expectedResult, actualInt);
    }

}