class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        return binary(nums,0,nums.length-1,target);
    }

    public int binary(int[] nums,int low,int high,int target)
    {
        int ans=nums.length;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>=target)
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
}