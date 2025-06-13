class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            leftsum=0;
            rightsum=0;
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            for(int k=i+1;k<n;k++){
                rightsum+=nums[k];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
}