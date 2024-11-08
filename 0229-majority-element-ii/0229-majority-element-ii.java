class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
       
       ArrayList <Integer> temp = new ArrayList <> ();

       for(int i=0;i<nums.length;i++)
        {
            if(temp.size()==0 || !( temp.contains(nums[i]) ) )
            {
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                    count++;
                    }
                }

                if(count > Math.floor(nums.length/3))
                {
                    temp.add(nums[i]);
                }  
            }
          
        } 

        return temp;
    }
}