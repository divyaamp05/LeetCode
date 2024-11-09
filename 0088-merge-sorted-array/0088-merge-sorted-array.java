class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int arr[]=new int [m+n];   
        int left=0;
        int right=0;
        int i=0;

        while(left<m && right<n)
        {
            if(nums1[left]<=nums2[right])
            {
                arr[i]=nums1[left];
                i++;
                left++;
            }
            else
            {
                arr[i]=nums2[right];
                i++;
                right++;
            }
        }

        while(left<m)
        {
            arr[i]=nums1[left];
            i++;
            left++;
        }

        while(right<n)
        {
            arr[i]=nums2[right];
            i++;
            right++;
        }

        for(i=0;i<m+n;i++)
        {
            
        
               nums1[i]=arr[i];
            

        }


    }
}