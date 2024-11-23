class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            
            int x=fun(weights,mid);

            if(x<=days)
            {
                ans=mid;
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return ans;
   
    }

    public int fun(int[] weights,int a)
    {
        int day=1;
        int load=0;

        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>a)
            {
                day++;
                load=weights[i];
            }

            else
            {
                load+=weights[i];
            }
        }

        return day;

    }

    
}