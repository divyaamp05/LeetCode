class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String words [] = s.split("\\s+");
        
        if(pattern.length()!=words.length)
        {
            return false;
        }

        HashMap <Character,String> mp =new HashMap <> ();

        for(int i=0;i<pattern.length();i++)
        {
            char a=pattern.charAt(i);
            String b=words[i];

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
                String c=mp.get(a);

                if(!b.equals(c))
                {
                    return false;
                }
            }
        }

        return true;


    }
}