class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nge[]=new int[n];

        for(int i=0;i<=n-1;i++){
            nge[i]=-1;
            for(int j=i+1;j<=i+n-1;j++){
                int ind=j%n;
                if(nums[ind]>nums[i]){
                    nge[i]=nums[ind];
                    break;
                }
            }
        }

        return nge;
    }
}