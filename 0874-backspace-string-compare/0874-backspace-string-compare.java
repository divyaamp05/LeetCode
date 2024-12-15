class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack <Character> st1 =new Stack ();
        Stack <Character> st2 =new Stack ();

        for(char i:s.toCharArray())
        {
            if(i=='#')
            {
                if(!st1.isEmpty())
                {
                    st1.pop();
                }
            }

            else
            {
                st1.push(i);
            }

            
        }


        for(char i:t.toCharArray())
        {
            if(i=='#')
            {
                if(!st2.isEmpty())
                {
                    st2.pop();
                }
            }

            else
            {
                st2.push(i);
            }
        }

        return st1.equals(st2);

    }
}