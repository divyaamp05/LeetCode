class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if(n==0 || n<0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }

        while(n>=2)
        {
            int rem=n%4;
            if(rem==0)
            {
                n=n/4;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}