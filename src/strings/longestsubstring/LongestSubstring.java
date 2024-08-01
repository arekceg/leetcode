package strings.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        final var stringLength = s.length();
        if (stringLength <= 1) {
            return stringLength;
        }
        Set<Character> charDuplicatesControl = new HashSet<>();
        int left = 0, right = 0, maxSubarray = 0;
        while (right < stringLength) {
            final var rightChar = s.charAt(right);
            if (!charDuplicatesControl.add(rightChar)) {
                while (charDuplicatesControl.contains(rightChar)) {
                    charDuplicatesControl.remove(s.charAt(left++));
                }
            } else {
                right++;
                maxSubarray = Math.max(right - left, maxSubarray);
            }
        }
        return maxSubarray;
    }
}
