class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int arr[] =new int[n1+n2];

        int left=0;
        int right=0;
        int i=0;

        while(left<n1 && right<n2)
        {
            if(nums1[left]<=nums2[right])
            {
                arr[i]=nums1[left];
                left++;
            }

            else
            {
                arr[i]=nums2[right];
                right++;
            }

            i++;
        }  

        while(left<n1)
        {
            arr[i]=nums1[left];
            left++;
            i++;
        }

        while(right<n2)
        {
            arr[i]=nums2[right];
            right++;
            i++;

        }

       int n=arr.length;

        if(n%2==1)
        {
           return arr[n/2];
        }

        else
        {
            return (arr[n/2]+arr[(n/2)-1])/2.0;
        }


        
    }
}