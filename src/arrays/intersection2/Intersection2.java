package arrays.intersection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.util.Arrays.sort;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] shorterArray = nums1;
        int[] longerArray = nums2;
        if (nums1.length > nums2.length) {
            shorterArray = nums2;
            longerArray = nums1;
        }
        var intersection = new int[longerArray.length];
        int longArrayIndex = 0;
        int shortArrayIndex = 0;
        int intersectionIndex = 0;
        while (longArrayIndex < longerArray.length && shortArrayIndex < shorterArray.length ) {
            var numFromShorterArray = shorterArray[shortArrayIndex];
            var numFromLongerArray = longerArray[longArrayIndex];
            if (numFromShorterArray < numFromLongerArray) {
                shortArrayIndex++;
            } else if (numFromShorterArray > numFromLongerArray) {
                longArrayIndex++;
            } else {
                intersection[intersectionIndex++] = numFromShorterArray;
                shortArrayIndex++;
                longArrayIndex++;
            }
        }
        return Arrays.copyOf(intersection, intersectionIndex);
    }

    public static int[] intersectLong(int[] nums1, int[] nums2) {
        int[] shorterArray = nums1;
        int[] longerArray = nums2;
        if (nums1.length > nums2.length) {
            shorterArray = nums2;
            longerArray = nums1;
        }
        var longIntCountMap = new HashMap<Integer, Integer>();
        for (int i : longerArray) {
            longIntCountMap.put(i, longIntCountMap.getOrDefault(i, 0) + 1);
        }
        var intersection = new ArrayList<Integer>();
        for (int i : shorterArray) {
            var intersectingInt = longIntCountMap.get(i);
            if (intersectingInt != null && intersectingInt > 0) {
                intersection.add(i);
                longIntCountMap.put(i, --intersectingInt);
            }
        }
        return intersection.stream().mapToInt(x -> x).toArray();
    }
}


/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

 */
