class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int sum1=0;
        int sum2=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++){

            sum1+=nums[i];
            max_sum=Math.max(max_sum,sum1);
            if(sum1<0){
                sum1=0;
            }

            sum2+=nums[i];
            min_sum=Math.min(min_sum,sum2);
            if(sum2>0){
                sum2=0;
            }  

        }

        int abs_sum=Math.max(max_sum,-min_sum);

        return abs_sum;

        
    }
}