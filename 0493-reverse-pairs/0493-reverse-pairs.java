class Solution 
{
    public int reversePairs(int[] nums) 
    {
        return mergesort(nums,0,nums.length-1); 
    }

    public int mergesort(int [] nums,int low,int high)
    {
        int cnt=0;
        if(low>=high)
        {
            return 0;
        }

        int mid= (low+high)/2;

        cnt+=mergesort(nums,low,mid);
        cnt+=mergesort(nums,mid+1,high);
        cnt+=count(nums,low,mid,high);
        merge(nums,low,mid,high);

        return cnt;
    }

    public int count(int[] nums, int low, int mid, int high)
    {
        int right=mid+1;

        int cnt=0;

        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long) nums[i]> (long) 2 * nums[right])
            {
                right++;
            }

            cnt=cnt+right-(mid+1);
        }

    
        return cnt;
    }

    public void merge(int [] nums,int low,int mid,int high)
    {
        ArrayList <Integer> temp =new ArrayList <> ();

        int left=low;
        int right=mid+1;

        while(left<=mid && right <=high)
        {
            if(nums[left]<=nums[right])
            {
                temp.add(nums[left]);
                left++;
            }
            else
            {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid)
        {
            temp.add(nums[left]);
            left++;
        }

        while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }
    }
}