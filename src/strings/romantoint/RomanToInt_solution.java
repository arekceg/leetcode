package strings.romantoint;

import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInt_solution {
    public static int romanToInt(String romanString) {
        final Map<Character, Character> modyfingChars = Map.of(
                'V', 'I',
                'X', 'I',
                'L', 'X',
                'C', 'X',
                'D', 'C',
                'M', 'C'
        );
        final Map<Character, Integer> romanCharToIntMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        final char[] romanStringCharArray = romanString.toCharArray();
        int result = 0;
        int j;
        for (int i = 0; i < romanStringCharArray.length; i++) {
            if (i < romanStringCharArray.length - 1) {
                j = i + 1;
            } else {
                j = i;
            }
            final char currentChar = romanStringCharArray[i];
            final char nextChar = romanStringCharArray[j];
            final Character modifyingChar = modyfingChars.get(nextChar);
            if (modifyingChar != null && modifyingChar == currentChar) {
                result -= romanCharToIntMap.get(currentChar);
                continue;
            }
            result += romanCharToIntMap.get(currentChar);
        }
        return result;
    }

    public static int romanToIntBackwards(String s) {
        final Map<Character, Integer> romanCharToIntMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000

        );
        int result = 0;
        int previousIntValue = Integer.MIN_VALUE;
        final var chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            final var currentIntValue = romanCharToIntMap.get(chars[i]);
            if (currentIntValue >= previousIntValue) {
                result += currentIntValue;
            } else {
                result -= currentIntValue;
            }
            previousIntValue = currentIntValue;
        }
        return result;
    }

//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

//    Example 1:
//
//    Input: s = "III"
//    Output: 3
//    Explanation: III = 3.
//
//    Example 2:
//
//    Input: s = "LVIII"
//    Output: 58
//    Explanation: L = 50, V= 5, III = 3.
//
//    Example 3:
//
//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
}
