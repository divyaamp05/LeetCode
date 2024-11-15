class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        return binary(nums,0,nums.length-1,target);
    }

    public int binary(int[] nums,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            else if(nums[mid]<target)
            {
                low=mid+1;
            }

            else
            {
                high=mid-1;
            }
        }

        return low;
        
    }
}