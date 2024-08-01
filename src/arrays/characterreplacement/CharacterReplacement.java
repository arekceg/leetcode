package arrays.characterreplacement;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    public static int characterReplacement(String s, int k) {
        // Make an array of size 26...
        int[] arr = new int[26];
        // Initialize largestCount, maxlen & beg pointer...
        int largestCount = 0, beg = 0, maxlen = 0;
        // Traverse all characters through the loop...
        for (int end = 0; end < s.length(); end++) {
            arr[s.charAt(end) - 'A']++;
            // Get the largest count of a single, unique character in the current window...
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
            // We are allowed to have at most k replacements in the window...
            // So, if max character frequency + distance between beg and end is greater than k...
            // this means we have considered changing more than k charactres. So time to shrink window...
            // Then there are more characters in the window than we can replace, and we need to shrink the window...
            if (end - beg + 1 - largestCount > k) {     // The main equation is: end - beg + 1 - largestCount...
                arr[s.charAt(beg) - 'A']--;
                beg++;
            }
            // Get the maximum length of repeating character...
            maxlen = Math.max(maxlen, end - beg + 1);     // end - beg + 1 = size of the current window...
        }
        return maxlen;
    }

    public static int characterReplacement_____(String s, int k) {
        int left = 0, right = 0, maxLength = Integer.MIN_VALUE, mostFrequentCharCount = 0;
        int windowLength = 1;
        Map<Character, Integer> charToCountMap = new HashMap<>();
        while (right < s.length()) {
            final var currentChar = s.charAt(right);
            var currentCharCount = charToCountMap.getOrDefault(currentChar, 0);
            charToCountMap.put(currentChar, ++currentCharCount);
            if (currentCharCount > mostFrequentCharCount) {
                mostFrequentCharCount = currentCharCount;
            }
            if (windowLength - mostFrequentCharCount > k) {
                charToCountMap.put(s.charAt(left++), charToCountMap.get(s.charAt(left)) - 1);
                windowLength--;
            } else {
                maxLength = Math.max(maxLength, windowLength);
            }
            right++;
            windowLength++;
        }
        return maxLength;
    }
}
