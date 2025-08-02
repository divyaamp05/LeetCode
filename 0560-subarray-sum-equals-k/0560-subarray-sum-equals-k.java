class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int presum=0;
        int cnt=0;
        HashMap<Integer,Integer> mp=new HashMap <> ();
        for(int i=0;i<n;i++){
            presum+=nums[i];
            if(presum==k){
                cnt++;
            }
            int val=presum-k;
            if(mp.containsKey(val)){
                cnt+=mp.get(val);
            }
            mp.put(presum,mp.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}