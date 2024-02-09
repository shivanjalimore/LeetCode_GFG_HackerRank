public class Numbers_of_Employee_who_met_the_target_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        int n= hours.length;
        for(int i=0;i<n;i++)
        {
            if(hours[i] >= target)
            {
             count++;
            }
        }
        return count;
    }
}
