package arrays.intersection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        final var intersectionControl = new HashSet<Integer>();
        final var intersection = new ArrayList<Integer>();
        for (int i : nums1) {
            intersectionControl.add(i);
        }
        for (int i : nums2) {
            if (intersectionControl.contains(i)){
                intersection.add(i);
                intersectionControl.remove(i);
            }
        }
        final var result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static int[] intersectSort(int[] firstArray, int[] secondArray) {
        return new int[0];
    }
}
