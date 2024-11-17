class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;

        int low=0;
        int high=n-1;

        if(nums.length==1)
        {
            return nums[0];
        }    

        if(nums[0]!=nums[1])
        {
            return nums[0];
        }

        if(nums[n-1]!=nums[n-2])
        {
            return nums[n-1];
        }

        while(low<=high)
        {
            int mid=(low + high)/2;

            if(mid%2==0)
            {
                if(nums[mid]==nums[mid+1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }

            else
            {
                if(nums[mid]==nums[mid-1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            
        }

        return nums[low];
        
    }
}