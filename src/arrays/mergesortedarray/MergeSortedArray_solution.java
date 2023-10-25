package arrays.mergesortedarray;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray_solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        var firstIndex = m - 1;
        var secondIndex = n - 1;
        var resultArrayIndex = m + n - 1;

        while (secondIndex >= 0){
            if (firstIndex >= 0 && nums1[firstIndex] > nums2[secondIndex]) {
                nums1[resultArrayIndex--] = nums1[firstIndex--];
            } else {
                nums1[resultArrayIndex--] = nums2[secondIndex--];
            }
        }
    }
}
