class Solution {
    public int countPairs(List<Integer> nums, int target) 
    {
        int left=0;
        int right=nums.size()-1;
        int cnt=0;

        Collections.sort(nums); 

        while(left<right)
        {
            if(nums.get(left)+nums.get(right)<target)
            {
                cnt=cnt+right-left;
                left++;
            }

            else
            {
                right--;
            }
        }
        return cnt;
         
    }
}