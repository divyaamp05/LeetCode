class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m=matrix.length;

        for(int i=0;i<m;i++)
        {
            if(binary(matrix[i],target))
            {
                return true;
            }
        }

        return false;
    }

    public boolean binary(int[] row,int target)
    {
        int low=0;
        int high=row.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(row[mid]==target)
            {
                return true;
            }

            else if(row[mid]<target)
            {
                low=mid+1;
            }

            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}