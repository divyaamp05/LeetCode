class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set <Integer> set =new HashSet <> ();
        Set <Integer> Intersection =new HashSet <> ();

        for(int i:nums1)
        {
            set.add(i);
        } 

        for(int i:nums2)
        {
            if(set.contains(i))
            {
                Intersection.add(i);
            }
        }

        int arr[]=new int[Intersection.size()];

        int j=0;
        for(int i:Intersection)
        {
            arr[j]=i;
            j++;
        }

        return arr;


    }
}