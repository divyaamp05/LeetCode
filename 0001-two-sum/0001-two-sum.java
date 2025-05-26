class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap <Integer,Integer> mp=new HashMap <> ();
        int a=0;
        int b=0;
        

        for(int i=0;i<n;i++){
            int x=target-nums[i];
            if(mp.containsKey(x)){
                a=mp.get(x);
                b=i;
                break;
            }
            mp.put(nums[i],i);
        }

        return new int[]{a,b};
    }
}