class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int nge[]=new int[n];
        for(int i=0;i<n;i++){
            nge[i]=-1;
            boolean flag=true;
            for(int j=i+1;j<=n-1;j++){
                if(nums[i]<nums[j]){
                    nge[i]=nums[j];
                    flag=false;
                    break;
                }
            }
            if(flag){
                for(int j=0;j<=i-1;j++){
                    if(nums[i]<nums[j]){
                        nge[i]=nums[j];
                        break;
                    }
                }
            }
            
        }

        return nge;
    }
}