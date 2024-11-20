class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();

        int ans=1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;

            int total=fun(piles,mid);

            if(total<=h)
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

    public int fun(int[] piles,int mid)
    {
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum+= Math.ceil((double) piles[i]/(double)mid);
        }

        return sum;
    }
}