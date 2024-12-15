class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap <Character,Character> mp= new HashMap <> ();

        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(!mp.containsKey(a))
            {
                if(!mp.containsValue(b))
                {
                    mp.put(a,b);
                }

                else
                {
                    return false;
                }
            }

            else
            {
                char c=mp.get(a);
                if(c!=b)
                {
                    return false;
                }
            }
        }

        return true;

        
    }
}