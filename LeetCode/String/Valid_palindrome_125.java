package LeetCode.String;

public class Valid_palindrome_125 {
    public boolean isPalindrome(String s) {
        // Initialize pointers for the start and end of the string
        int left = 0, right = s.length() - 1;
        
        // Iterate until the pointers meet in the middle
        while (left < right) {
            // Skip non-alphanumeric characters and move pointer
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // If characters at the current pointers don't match, return false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            // Move pointers towards the middle
            left++;
            right--;
        }
        // If the loop completes without returning false, the string is a palindrome
        return true;
    }
}
