public class Shuffle_the_Array_1470 {
    // This method takes an array of integers (nums) and an integer (n) as input,
    // and it returns a new array obtained by shuffling the elements of the input array.
    public int[] shuffle(int[] nums, int n) {
        // Create a new array to store the shuffled elements.
        // The length of the new array is twice the value of n.
        int[] result = new int[2 * n];

        // Iterate through the first half of the result array (up to n).
        for (int i = 0; i < n; i++) {
            // Assign the element at index i from the input array (nums) to the even indices (2 * i) of the result array.
            result[2 * i] = nums[i];  // x_i

            // Assign the element at index i + n from the input array (nums) to the odd indices (2 * i + 1) of the result array.
            result[2 * i + 1] = nums[i + n];  // y_i
        }

        // Return the shuffled array (result).
        return result;
    }
}