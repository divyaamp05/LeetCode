class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int presum = 0;
        int count = 0;

        Map <Integer,Integer> mp = new HashMap <> ();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) 
        {
            presum += nums[i];

            int remove = presum - k;

            count += mp.getOrDefault(remove, 0);

            mp.put(presum, mp.getOrDefault(presum, 0) + 1);
        }
        return count;
    }
}