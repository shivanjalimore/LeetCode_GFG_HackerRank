import java.util.*;
class Array_subset_of_another_array{
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> set = new HashSet<>();
        boolean[] flag = new boolean[(int) n];
        
         // Add all elements of a2 to the HashSet
        for (int i = 0; i < m; i++) {
            set.add(a2[i]);
        }
        
          int count = 0;
        // Iterate through elements of a1 and check if they exist in a2 HashSet
        for (int i = 0; i < n; i++) {
            if (set.contains(a1[i]) && !flag[(int) i]) {
                count++;
                flag[(int) i] = true;
            }
        }
        
        // If count is equal to m, then all elements of a2 were found in a1
        if (count >= m) {
            return "Yes";
        } else {
            return "No";
        }
        
    }
}