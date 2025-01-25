class Solution {
    public boolean isValid(String s) 
    {
        Stack <Character> st =new Stack <>();

        for(char i:s.toCharArray())
        {
 
            if(i=='(' || i=='{' || i=='[')
            {
                st.push(i);
            }

            else
            {
                if(st.isEmpty())
                {
                    return false;
                }

                char a=st.peek();

                if((i==')' && a=='(') || (i=='}' && a=='{') || (i==']' && a=='['))
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