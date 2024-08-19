package arrays.mergesortedarray;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int insertionIndex = nums1.length - 1;
        int mIndex = m - 1;
        int nIndex = n - 1;
        while (nIndex >= 0) {
            if (mIndex >= 0 && nums1[mIndex] >= nums2[nIndex]) {
                nums1[insertionIndex--] = nums1[mIndex--];
            } else {
                nums1[insertionIndex--] = nums2[nIndex--];
            }
        }
    }
}
