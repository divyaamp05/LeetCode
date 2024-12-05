class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap <Character,Integer> S =new HashMap <> ();
        HashMap <Character,Integer> T =new HashMap <> ();


        for(char i:s.toCharArray())
        {
            S.put(i,S.getOrDefault(i,0)+1);
        }

        for(char i:t.toCharArray())
        {
            T.put(i,T.getOrDefault(i,0)+1);
        }

        return S.equals(T);
        

    }
}