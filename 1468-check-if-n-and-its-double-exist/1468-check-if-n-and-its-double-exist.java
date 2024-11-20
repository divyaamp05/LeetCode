class Solution {
    public boolean checkIfExist(int[] arr)
    {
        return mergesort(arr,0,arr.length-1);
    }

    public boolean mergesort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return false;
        }

        int mid=(low+high)/2;

        boolean left=mergesort(arr,low,mid);
        boolean right=mergesort(arr,mid+1,high);
        boolean flag=cnt(arr,low,mid,high);
        merge(arr,low,mid,high);

        return flag || left || right;
    }

    public boolean cnt(int[]arr,int low,int mid,int high)
    {

        for(int i=low;i<=mid;i++)
        {
            int right=mid+1;
            while(right<=high)
            {
                if(arr[i]==2*arr[right] || arr[right]==2*arr[i])
                {
                    return true;
                }
                right++;
            }
        } 

        return false;
    }

    public void merge(int[]arr,int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;

        ArrayList <Integer> temp =new ArrayList <> ();

        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }

            else
            {
                temp.add(arr[right]);
                right++;
            }

        }

        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }

        while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }
    }
}