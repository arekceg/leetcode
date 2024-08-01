package arrays.twosum.second;

public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                break;
            }
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        int firstResultIndex = left + 1;
        int secondResultIndex = right + 1;
        return new int[]{firstResultIndex, secondResultIndex};
    }
}
