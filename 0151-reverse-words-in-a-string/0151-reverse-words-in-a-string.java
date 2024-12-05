class Solution {
    public String reverseWords(String s) 
    {
       String ans="";
       String word="";
       
       int i=0;

       while(i<s.length())
       {
            while(i<s.length() && s.charAt(i)==' ')
            {
                i++;
            }

            word="";

            while(i<s.length() && s.charAt(i)!=' ')
            {
                word+=s.charAt(i);
                i++;
            }

            if(!word.equals(""))
            {
                ans=word + " " + ans;
            }
       } 

       if(ans.isEmpty())
        {
           return "";
        }

        return ans.substring(0,ans.length()-1);
    }
}