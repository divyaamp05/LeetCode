class Solution {
    public int countSubstrings(String s) 
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            //for odd length
            int low=i;
            int high=i;

            while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
            {
                count++;
                low--;
                high++;
            }


            //for even length
            low=i;
            high=i+1;

            while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
            {
                count++;
                low--;
                high++;
            }

        }

        return count;
    }
}