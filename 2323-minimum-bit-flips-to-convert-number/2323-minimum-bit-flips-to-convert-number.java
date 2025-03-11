class Solution {
    public int minBitFlips(int start, int goal) {
        int res=start^goal;
        int count=0;
        for(int i=0;i<31;i++){
            count+=res&1;
            res=res>>1;
        }
        return count;
    }
}