class Solution {
    public int countPartitions(int[] nums) 
    {
        int cnt=0;
        

        for(int i=0;i<nums.length-1;i++)
        {
            int sum1=0;
            int sum2=0;
            for(int j=0;j<=i;j++)
            {
                sum1+=nums[j];
            }

            for(int j=i+1;j<nums.length;j++)
            {
                sum2+=nums[j];
            }

            int diff=Math.abs(sum1-sum2);
            if(diff%2==0)
            {
                cnt++;
            }
        }

        return cnt;
    }
}