public class Binary_search {
    int binarysearch(int arr[], int n, int k) {
        
        // code here
       int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
                return mid; // Element found
            } else if (arr[mid] < k) {
                left = mid + 1; // Discard the left half
            } else {
                right = mid - 1; // Discard the right half
            }
        }
        
        return -1; // Element not found
    }
}
