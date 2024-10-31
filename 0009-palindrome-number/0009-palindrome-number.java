class Solution {
    public boolean isPalindrome(int x)
    {
        int n=Math.abs(x);
        int rem=0;
        int res=0;
        while(n!=0)
        {
            rem=n%10;
            
            res=(res*10)+rem;
            n=n/10;
        }

        if(x==res)
        {
            return true;
        }
        else
        {
            return false;
        }
               
    }
}