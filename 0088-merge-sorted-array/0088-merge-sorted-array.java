class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        int l = 0;
        int r = 0;
        int i = 0;

        while (l < m && r < n) 
        {
            if (nums1[l] < nums2[r]) 
            {
                arr[i] = nums1[l];
                l++;
                i++;
            }

            else 
            {
                arr[i] = nums2[r];
                r++;
                i++;
            }
        }

        while (l < m && i < m + n) 
        {
            arr[i] = nums1[l];
            l++;
            i++;
        }

        while (r < n && i < m + n) 
        {
            arr[i] = nums2[r];
            r++;
            i++;
        }

        for (i = 0; i < m + n; i++) 
        {
            nums1[i] = arr[i];
        }

    }
}