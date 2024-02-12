package LeetCode.Array.Easy;

public class Squares_of_a_sorted_array_977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                arr[index--] = leftSquare;
                left++;
            } else {
                arr[index--] = rightSquare;
                right--;
            }
        }

        return arr;
    }
}
