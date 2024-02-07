package GFG.String;

public class Longest_coomon_prefix_in_array {
        //compare function
        String compare(String s1, String s2)
        {
            int i=0,j=0;
            String ret="";
            while(i<s1.length() && j<s2.length())
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                ret += String.valueOf(s1.charAt(i));
                }
                else
                {
                    return ret;
                }
                i++;j++;
            }
            return ret;
        }
    
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans = arr[0];
        
        for(int i=0;i<n-1;i++)
        {
            String x = compare(ans,arr[i+1]);
            if(x.equals(""))
            {
                return "-1";
            }
            ans = x;
        }
        return ans;
    }
}
