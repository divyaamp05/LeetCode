class Solution {
    public int secondHighest(String s) 
    {
        TreeSet <Integer> set =new TreeSet <> ();

        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                set.add(ch-'0');
            }
        }

        if(set.size()<2)
        {
            return -1;
        }

        set.pollLast();
        return set.last();

        
    }
}