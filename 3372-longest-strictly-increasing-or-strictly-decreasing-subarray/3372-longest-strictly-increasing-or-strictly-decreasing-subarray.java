class Solution {
    public int longestMonotonicSubarray(int[] nums) 
    {
        int n=nums.length;
        int cnt1=1;
        int cnt2=1;
        int max_cnt1=Integer.MIN_VALUE;
        int max_cnt2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            cnt1=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]>nums[j-1])
                {
                    cnt1++;
                }

                else 
                {
                    break;
                }
            }

            max_cnt1=Math.max(cnt1,max_cnt1);
        }

        for(int i=0;i<n;i++)
        {
            cnt2=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    cnt2++;
                }

                else 
                {
                    break;
                }
            }

            max_cnt2=Math.max(cnt2,max_cnt2);
        }


        return Math.max(max_cnt1,max_cnt2);
    }
}