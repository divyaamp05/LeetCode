class Solution 
{
    public int lower(int[] nums,int low,int high,int target)
    {
        int a1=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>=target)
            {
                a1=mid;
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return a1;
    }

    public int upper(int[] nums,int low,int high,int target)
    {
        int a2=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]>target)
            {
                a2=mid;
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return a2 == -1 ? nums.length : a2;
    }

    public int[] searchRange(int[] nums, int target) 
    {
        if(nums == null || nums.length==0)
        {
            return new int [] {-1,-1};
        }
        int lb=lower(nums,0,nums.length-1,target);
        int ub=upper(nums,0,nums.length-1,target);

        if(lb==-1 || lb == nums.length || nums[lb]!=target)
        {
            return new int [] {-1,-1};
        }

        else
        {
            return new int [] {lb,ub-1};
        }
    }
}