import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_all_pair_with_a_given_sum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        Set<Long> set = new HashSet<>();
        ArrayList<pair> li = new ArrayList<>();
        for(long s: B)
        {
            set.add(s);
        }
        
        for(long s : A)
        {
            if(set.contains(X-s))
            {
                pair p = new pair(s , X-s);
                li.add(p);
            }
        }
        pair ans[] = new pair[li.size()];
        int k=0;
        for(pair x : li)
        {
            ans[k++] = x;
        }
        return ans;
    }
}
