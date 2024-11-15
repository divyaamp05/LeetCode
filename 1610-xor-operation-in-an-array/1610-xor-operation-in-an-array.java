class Solution {
    public int xorOperation(int n, int start) 
    {
        int [] arr =new int [n];
        int res=0;

        for(int i=0;i<n;i++)
        {
            arr[i] = start + 2 * i;
            res = res^ arr[i];
        }

        return res;
    }
}