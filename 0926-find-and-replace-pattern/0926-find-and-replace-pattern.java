class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        ArrayList <String> list =new ArrayList <> ();
        HashMap <Character,Character> mp =new HashMap <> ();
        

        for(int i=0;i<words.length;i++)
        {
            String w=words[i];
            mp.clear();
            boolean match =true;
            for(int j=0;j<w.length();j++)
            {
                char a=w.charAt(j);
                char b=pattern.charAt(j);

                if(!(mp.containsKey(a)))
                {
                    if(!(mp.containsValue(b)))
                    {
                        mp.put(a,b);
                    }
                    
                    else
                    {
                        match=false;
                        break;
                    }
                }

                else
                {
                    char c=mp.get(a);
                    if(c!=b)
                    {
                        match=false;
                        break;
                    }
                }
            }
            if(match==true)
            {
                list.add(w);
            }
            
        }

        return list;
    }
}