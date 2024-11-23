class Solution {
    public int smallestDivisor(int[] nums, int threshold) 
    {
        int low=1; 
        int high=Arrays.stream(nums).max().getAsInt(); 
        int res=0;

        while(low<=high)
        {
            int mid=(low+high)/2;

            int ans=fun(mid,nums);

            if(ans<=threshold)
            {
                res=mid;
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return res;
     
    }

    public int fun(int mid,int[] nums)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((double)nums[i]/mid);
        }

        return sum;
    }
}