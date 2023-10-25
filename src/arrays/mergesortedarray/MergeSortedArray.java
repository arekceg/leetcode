package arrays.mergesortedarray;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstIndex = m - 1;
        int secondIndex = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (secondIndex < 0) {
                nums1[i] = nums1[firstIndex--];
            } else if (firstIndex < 0) {
                nums1[i] = nums2[secondIndex--];
            } else if (nums1[firstIndex] > nums2[secondIndex]) {
                nums1[i] = nums1[firstIndex--];
            } else {
                nums1[i] = nums2[secondIndex--];
            }
        }
    }
}
