package strings.isanagram;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        var charCountMap = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            var count = entry.getValue();
            if (count != 0) {
                return false;
            }
        }
        return true;

    }
}
