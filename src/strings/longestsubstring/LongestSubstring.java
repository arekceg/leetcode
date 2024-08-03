package strings.longestsubstring;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        var chars = s.toCharArray();
        int l = 0, p = 0;
        int maxSubstring = 0;
        var end = chars.length - 1;
        var duplicateValidator = new HashSet<Character>();
        while (p <= end) {
            while (!duplicateValidator.add(chars[p])) {
                duplicateValidator.remove(chars[l]);
                l++;
            }
            p++;
            maxSubstring = Math.max(maxSubstring, p - l);
        }
        return maxSubstring;
    }

    /*
    1. L and P pointers
    2. Expand window with P++ until duplicate appears
    3. Contract window with L-- until no longer duplicating
    4. Repeat until P = s.length - 1
     */
}
