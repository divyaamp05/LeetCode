class Solution {
    public int longestMonotonicSubarray(int[] nums) 
    {
        if(nums.length==1)
        {
            return 1;
        }
        int incr=1;
        int decr=1;

        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                incr++;
                decr=1;
            }

            else if(nums[i]>nums[i+1])
            {
                decr++;
                incr=1;
            }

            else
            {
                incr=1;
                decr=1;
            }

        max=Math.max(max,Math.max(incr,decr));
           
        }

        return max;
    }
}