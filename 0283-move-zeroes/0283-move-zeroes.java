class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=0 && nums[i]==0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }

            else if(nums[j]==0 && nums[i]!=0)
            {
                i++;
            }

            else if(nums[j]!=0 && nums[i]!=0)
            {
                i++;
            }
        }
    }
}