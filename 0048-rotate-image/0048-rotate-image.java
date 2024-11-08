class Solution {
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length;

        //transpose matrix
        for (int i = 0; i <= n - 2; i++) 
        {
            for (int j = i + 1; j <= n - 1; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse row 

        for(int i=0;i<n;i++)
        {
            int left=0;
            int right=n-1;
            while(left<right)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }

    }
}