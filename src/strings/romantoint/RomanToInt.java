package strings.romantoint;

import java.util.Map;

public class RomanToInt {
    public static final Map<Character, Integer> ROMAN_VALUE_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );


    public static int romanToInt(String s) {
        var charArray = s.toCharArray();
        int result = 0;
        int previousValue = Integer.MIN_VALUE;
        for (int i = charArray.length - 1; i >= 0; i--) {
            var currentValue = ROMAN_VALUE_MAP.get(charArray[i]);
            if (currentValue >= previousValue){
                result += currentValue;
            } else {
                result -= currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }
}
