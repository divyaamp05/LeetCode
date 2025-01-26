class Solution {
    public String longestPalindrome(String s) 
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            //for odd length
            int low=i;
            int high=i;

            while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }

            String str =s.substring(low+1,high);

            if(str.length()>ans.length())
            {
                ans=str;
            }

            //for even length
            low=i;
            high=i+1;

            while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }

            str =s.substring(low+1,high);

            if(str.length()>ans.length())
            {
                ans=str;
            }


        }

        return ans;
    }
}