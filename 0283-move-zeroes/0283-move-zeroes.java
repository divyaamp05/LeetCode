class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            else if(nums[i]!=0 && nums[j]!=0){
                i++;
            }
            else if(nums[i]!=0 && nums[j]==0){
                i++;
            }
        }
    }
}