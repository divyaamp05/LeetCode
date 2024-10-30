class Solution {
    public int majorityElement(int[] nums) 
    {
        int count=0;
        int el=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        int cnt1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(el==nums[i])
            {
                cnt1++;
            }
        }

        if(cnt1>(nums.length/2))
        {
            return el;
        }
        else
        {
            return -1;
        }
    }
}