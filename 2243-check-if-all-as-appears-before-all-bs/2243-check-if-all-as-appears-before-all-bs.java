class Solution {
    public boolean checkString(String s) 
    {
        int n=s.length();

        if(s.charAt(0)=='b' & s.charAt(n-1)=='a')
        {
            return false;
        }

        for(int i=n-1;i>0;i--)
        {
            if((s.charAt(i)=='a') && (s.charAt(i-1)=='b'))
            { 
                return false;
            }
        }

        return true;
    }
}