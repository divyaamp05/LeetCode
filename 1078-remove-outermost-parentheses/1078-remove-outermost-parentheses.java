class Solution {
    public String removeOuterParentheses(String s) 
    {
        Stack <Character> st =new Stack <> ();
        StringBuilder ans=new StringBuilder ();

        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                if(!st.isEmpty())
                {
                    ans.append(i);
                }

                st.push(i);
            }

            else
            {
                st.pop();

                if(!st.isEmpty())
                {
                    ans.append(i);
                }

            }
        }

        return ans.toString();


    }
}