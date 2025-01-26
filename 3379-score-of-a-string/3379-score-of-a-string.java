class Solution {
    public int scoreOfString(String s)
    {
        int i=0;
        int sum=0;
        while(i<s.length()-1)
        {
            int a=(int) s.charAt(i);
            int b=(int) s.charAt(i+1);

            int diff=Math.abs(a-b);

            sum+=diff;
            i++;
        }

        return sum;
    }
}