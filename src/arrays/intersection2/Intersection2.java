package arrays.intersection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i1 =0;
        int i2=0;
        int k = 0;
        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] == nums2[i2]){
                nums1[k++] = nums2[i2++];
                i1++;
            } else if (nums1[i1] > nums2[i2]){
                i2++;
            } else {
                i1++;
            }
        }

        return Arrays.copyOf(nums1, k);
    }
}
