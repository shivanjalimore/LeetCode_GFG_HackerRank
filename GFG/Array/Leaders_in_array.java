import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_array {
    static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i;
        int max=arr[n-1];
        
        for(i= n-1 ; i>=0 ;i--)
        {
           
            if(arr[i] >= max)
            {
                max= arr[i];
                result.add(max);
            }
            
        }
        Collections.reverse(result);
        return result;
    }
}
