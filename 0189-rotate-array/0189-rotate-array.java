class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n];
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }

    public void reverse(int[] nums,int l,int h){
        while(l<=h){
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
}