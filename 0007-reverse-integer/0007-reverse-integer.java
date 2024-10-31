class Solution {
    public int reverse(int x) 
    { 
        int n=Math.abs(x);
        int rem=0;
        int res=0;
        while(n!=0)
        {
            rem=n%10;
            if(res > (Integer.MAX_VALUE-rem)/10)
            {
                return 0;
            }
            res=(res*10)+rem;
            
            n=n/10;
        }

        if(x<0)
        {
            res=-res;
        }

        return res;
        
    }
}