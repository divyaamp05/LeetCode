class Solution {
    public String clearDigits(String s) 
    {
        Stack <Character> st =new Stack <> ();

        StringBuilder str=new StringBuilder ();

        for(char i:s.toCharArray())
        {
            if(!Character.isDigit(i))
            {
                st.push(i);
            }

            if(Character.isDigit(i))
            {
                st.pop();
            }

        }

        while(!st.isEmpty())
        {
            str.insert(0,st.pop());
        }

        return str.toString();
    }
}