class Solution {
    public double myPow(double x, int n) 
    { 
        if(n==0)
        {
            return 1;
        }

        else if(n==1)
        {
            return x;
        }
        
        else
        {
            return Math.pow(x,n);
        }
 
        
    }
}