class Solution 
{
    public int myAtoi(String s) 
    {  
    if(s.length()==0 || s==null)
    {
        return 0;
    }

    int ans=0;

    s=s.trim();

    int i=0;
    int sign=1;
    if(s.length() >0 && (s.charAt(i)=='-' || s.charAt(i)=='+'))
    {
        sign=(s.charAt(i)=='-') ? -1:1;
        i++;
    }


    while(i<s.length() && s.charAt(i)=='0')
    {
        i++;
    }
    while(i<s.length())
    {
        char ch=s.charAt(i);

        if(!Character.isDigit(ch))
        {
            break;
        }

        int a=ch-'0';
      
         //to prevent overflow
        if(ans>(Integer.MAX_VALUE-a)/10)
        {
            return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        ans=ans*10+a;
        i++;
    }

    return ans*sign;
   }
}