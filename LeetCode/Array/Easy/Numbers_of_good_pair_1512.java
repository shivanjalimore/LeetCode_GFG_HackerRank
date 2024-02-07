class Numbers_of_good_pair_1512
 {
    public int numIdenticalPairs(int[] nums) {
        int i,j;
        int count=0;
        int n = nums.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
               if(nums[i] == nums[j])
               {
                 count++;
               }
            }
        }
        return count;
    }
}