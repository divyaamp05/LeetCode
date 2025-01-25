class Solution {
    public int maxDepth(String s) 
    {
        int cnt=0;
        int max_count=0;

        //Stack <Character> st =new Stack <> ();

        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                //st.push(i);
                cnt++;
                max_count=Math.max(cnt,max_count);
            }

            else if(i== ')')
            {
                //st.pop();
                cnt--;
            }
        }

        return max_count;
    }
}