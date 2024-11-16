class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int a=fun1(nums,target);
        if(a==-1)
        {
            return new int [] {-1,-1};
        }
        int b=fun2(nums,target);

        return new int [] {a,b};
    }

    public int fun1(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int first=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                first=mid;
                high=mid-1;
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

        return first;
    }

    public int fun2(int[] nums, int target)
    {
        int low=0;
        int high=nums.length-1;
        int last=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                last=mid;
                low=mid+1;
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

        return last;
    }
}