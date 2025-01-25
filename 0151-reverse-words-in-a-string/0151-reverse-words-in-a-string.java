class Solution {
    public String reverseWords(String s) 
    {
        s=s.trim();
        String ans="";
        String w="";
        int i=0;

        while(i<s.length())
        {
            while(i<s.length() && s.charAt(i)==' ')
            {
                i++;
            }

            
            w="";
            while(i<s.length() && s.charAt(i)!=' ')
            {
                w+=s.charAt(i);
                i++;
            }

            ans=w + " "+ ans;
            
        }

        ans=ans.trim();
        return ans;
    }
}