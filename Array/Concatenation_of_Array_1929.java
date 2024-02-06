class Concatenation_of_Array_1929 {
    // This method takes an array of integers as input and returns a new array
    public int[] getConcatenation(int[] nums) {
        // Get the length of the input array
        int n = nums.length;
        
        // Create a new array with double the length of the input array
        int[] arr3 = new int[n * 2];

        // Copy the elements of the input array 'nums' to the new array 'arr3'
        // The destination array 'arr3' starts at index 0, and the source array 'nums' also starts at index 0
        // Copy 'n' elements from 'nums' to 'arr3'
        System.arraycopy(nums, 0, arr3, 0, n);

        // Copy the elements of the input array 'nums' to the new array 'arr3' again
        // The destination array 'arr3' starts at index 'n', and the source array 'nums' also starts at index 0
        // Copy 'n' elements from 'nums' to 'arr3' starting at index 'n'
        System.arraycopy(nums, 0, arr3, n, n);

        // Return the concatenated array 'arr3'
        return arr3;
    }
}