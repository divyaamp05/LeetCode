class Solution {
    public String removeOuterParentheses(String s) 
    {

        StringBuilder ans=new StringBuilder();
        int count=0;

        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                if(count!=0)
                {
                    ans.append(i);
                }
                count++;
            }

            else if(i==')')
            {
                count--;
                if(count!=0)
                {
                    ans.append(i);
                }
                
            }
        }

        return ans.toString();
    }
}