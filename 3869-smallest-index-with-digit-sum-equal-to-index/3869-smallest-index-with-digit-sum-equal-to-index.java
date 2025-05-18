class Solution {
    public int smallestIndex(int[] nums) {
        int a=-1;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int rem=0;
            int sum=0;
            while(x!=0){
                rem=x%10;
                sum+=rem;
                x=x/10;
            }

            if(sum==i){
                a=i;
                break;
            }
        }

        return a;
    }
}