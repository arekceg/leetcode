package arrays.mergesortedarray;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m == 0){
                nums1[i] = nums2[n-1];
                n--;
                continue;
            }
            if (n == 0){
                nums1[i] = nums1[m-1];
                m--;
                continue;
            }
            var firstArrayInt = nums1[m - 1];
            var secondArrayInt = nums2[n - 1];
            if (firstArrayInt > secondArrayInt){
                nums1[i] = firstArrayInt;
                m--;
            } else {
                nums1[i] = secondArrayInt;
                n--;
            }
        }
    }
}
