class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int l=0;
        int r=nums.length-1;
        int i=nums.length-1;

        int arr [] =new int [nums.length];
        
       
        while(l<=r)
        {
            if(nums[l] * nums[l] <= nums[r] * nums[r])
            {
                arr[i]=nums[r] * nums[r];
                i--;
                r--;
            }

            else
            {
                arr[i]=nums[l] *nums[l];
                i--;
                l++;
            }
        }

        return arr;

    }
}