package arrays.twosum;

    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumSorted {
        public int[] twoSum(int[] numbers, int target) {
            int leftIndex = 0, rightIndex = numbers.length -1;

            while (leftIndex < rightIndex){
                int sum = numbers[leftIndex] + numbers[rightIndex];
                if (sum == target){
                    return new int[]{++leftIndex, ++rightIndex};
                }
                if (sum < target){
                    leftIndex ++;
                } else {
                    rightIndex--;
                }

            }
            return null;
        }
}
