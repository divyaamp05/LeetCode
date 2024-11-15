class Solution {
    public int search(int[] nums, int target) 
    {
        return rec(nums,0,nums.length-1,target);
    }

    public int rec(int[] nums, int low, int high, int target)
    {
        while(low<=high)
        {
            int mid= (low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            else if(nums[mid]<target)
            {
                return rec(nums,mid+1,high,target);
            }

            else
            {
                return rec(nums,low,mid-1,target);
            }
        }

        return -1;
    }
}