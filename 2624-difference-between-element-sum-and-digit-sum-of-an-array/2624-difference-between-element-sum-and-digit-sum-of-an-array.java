class Solution {
    public int differenceOfSum(int[] nums) {
        if (nums.length == 0) 
        {
            return nums[0];
        }
        int sum1 = 0;
        int sum = 0;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            sum1 += nums[i];
            int n = nums[i];
            while (n != 0) 
            {
                rem = n % 10;
                sum += rem;
                n = n / 10;
            }
        }

        return Math.abs(sum - sum1);

    }
}