package arrays.intersection2;

import java.util.*;

public class Intersection2_solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> intCountMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();
        for (int i : nums1) {
            intCountMap.put(i, intCountMap.getOrDefault(i, 0) + 1);
        }
        for (int i : nums2) {
            var currentIntCount = intCountMap.get(i);
            if (currentIntCount != null && currentIntCount > 0) {
                intersection.add(i);
                intCountMap.put(i, --currentIntCount);
            }
        }
        final var ans = new int[intersection.size()];
        var index = 0;
        for (int i : intersection) {
            ans[index++] = i;
        }
        return ans;
    }

    public static int[] intersectSort(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        final var intersection = new ArrayList<Integer>();

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        final var ans = new int[intersection.size()];
        var index = 0;
        for (int intersectionPoint : intersection) {
            ans[index++] = intersectionPoint;
        }
        return ans;
    }
}
