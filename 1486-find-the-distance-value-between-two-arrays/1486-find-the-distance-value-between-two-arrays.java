class Solution 
{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        Arrays.sort(arr2);
        int count=0;
        for(int i:arr1)
        {
            if(isValid(i,arr2,d))
            {
                count++;
            }
        }
        return count;
    }

    public boolean isValid(int num,int[] arr2,int d)
    {
        int low=0;
        int high=arr2.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(Math.abs(arr2[mid]-num)<=d)
            {
                return false;
            }

            if(arr2[mid]<=num)
            {
                low=mid+1;
            }

            else
            {
                high=mid-1;
            }
        }

        return true;
    }
}