class Solution 
{
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);

        int n= nums.length;

        if(n==1)
        {
            return nums[0];
        }
        else if(nums[0]!=nums[1])
        {
            return nums[0];
        }
        else if(nums[n-2]!=nums[n-1])
        {
            return nums[n-1];
        }

        for(int i=1;i<nums.length;i+=3)
        {
            if(nums[i]!=nums[i-1])
            {
                return nums[i-1];
            }
        }

        return nums[nums.length-1];

    }
}