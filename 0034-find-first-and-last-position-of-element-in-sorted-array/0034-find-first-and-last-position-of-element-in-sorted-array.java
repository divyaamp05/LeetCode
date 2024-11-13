class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int e1=-1;
        int e2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(e1==-1)
                {
                    e1=i;
                }
                e2=i;
            }

        } 

        return new int [] {e1,e2}; 

   

         
    }
}