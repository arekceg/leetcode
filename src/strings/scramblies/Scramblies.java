package strings.scramblies;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            final var currentChar = str1.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            final var currentChar = str2.charAt(i);
            var currentCharCount = charCountMap.get(currentChar);
            if (currentCharCount == null || currentCharCount <= 0) {
                return false;
            }
            charCountMap.put(currentChar, --currentCharCount);

        }
        return true;
    }
}
