class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int i=0;
        int j=0;

        while(i<t.length() && j<s.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }

        return j==s.length();
    }
}