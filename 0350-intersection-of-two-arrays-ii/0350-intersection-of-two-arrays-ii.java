class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1=nums1.length;
        int n2=nums2.length;

        int l=0;
        int r=0;

        ArrayList <Integer> temp =new ArrayList <> ();

        while(l<n1 && r<n2)
        {
            if(nums1[l] == nums2[r])
            {
                temp.add(nums1[l]);
                l++;
                r++;
            }

            else if(nums1[l] < nums2[r])
            {
                l++;
            }

            else
            {
                r++;
            }
        }

        int arr [] = new int [temp.size()]; 

        for(int i=0;i<temp.size();i++)
        {
            arr[i]=temp.get(i);
        }

        return arr;
    }
}