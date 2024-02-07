import java.util.ArrayList;

public class Find_duplicate_in_an_array {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int a[] = new int[n];
        
        //add value of arr[i] in array a[]
        for(int i=0;i<n;i++)
        {
            a[arr[i]] += 1;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] > 1)
            {
                result.add(i);
            }
        }
        if(result.size() == 0)
        {
            result.add(-1);
        }
        return result;
    }
}
