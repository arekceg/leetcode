package strings.isanagram;

import java.util.HashMap;

public class IsAnagram_solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        final var firstCharArray = s.toCharArray();
        final var secondCharArray = t.toCharArray();

        for (int i = 0; i < firstCharArray.length; i++) {
            characterCountMap.put(firstCharArray[i], characterCountMap.getOrDefault(firstCharArray[i], 0) + 1);
            characterCountMap.put(secondCharArray[i], characterCountMap.getOrDefault(secondCharArray[i], 0) - 1);
        }
        for (Integer count : characterCountMap.values()) {
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
