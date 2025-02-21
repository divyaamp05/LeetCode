class Solution {
    public int secondHighest(String s) 
    {
        int first=-1;
        int second=-1;

        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                int num=ch-'0';

                if(num>first)
                {
                    second=first;
                    first=num;
                }

                else if(second<num && num<first)
                {
                    second=num;
                }
            }
        }

        return second;

        

        
    }
}