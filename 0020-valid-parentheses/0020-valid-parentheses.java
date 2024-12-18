class Solution {
    public boolean isValid(String s) 
    {
        Stack <Character> st =new Stack <>();

        for(char i:s.toCharArray())
        {
            char a=i;

            if(a=='(' || a=='{' || a=='[')
            {
                st.push(a);
            }

            else
            {
                if(st.isEmpty())
                {
                    return false;
                }

                char b=st.peek();

                if((a==')' && b=='(') || (a=='}' && b=='{') || (a==']' && b=='['))
                {
                    st.pop();
                }

                else
                {
                    return false;
                }


            }

        }

        if(st.isEmpty())
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}