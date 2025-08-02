class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        int sum=0;
        HashMap<Integer,Integer> mp=new HashMap <> ();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){//case-2
                cnt++;
            }
            int x=sum-k;//case-1
            if(mp.containsKey(x)){
                cnt+=mp.get(x);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}