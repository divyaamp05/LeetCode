class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int l=0;
        int r=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set <Integer> st =new HashSet <> ();

        while(l<nums1.length && r<nums2.length)
        {
            if(nums1[l]==nums2[r])
            {
               st.add(nums1[l]);
               l++;
               r++;
            }

            else if(nums1[l] > nums2[r])
            {
                r++;
            }

            else
            {
                l++;
            }
        }
        
        int arr [] =new int[st.size()];

        int j=0;
        for(int i:st)
        {
            arr[j]=i;
            j++;
        }


        return arr;
    }
}