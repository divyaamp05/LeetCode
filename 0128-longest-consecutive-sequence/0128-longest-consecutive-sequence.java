class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length==0 || nums==null)
        {
            return 0;
        }   

        Set <Integer> st =new HashSet<> ();

        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
        }
        
        int longest=Integer.MIN_VALUE;
        for(int i:st)
        {
            if(!st.contains(i-1))
            {
                int x=i;
                int count=1;
                while(st.contains(x+1))
                {
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
        
    }
}