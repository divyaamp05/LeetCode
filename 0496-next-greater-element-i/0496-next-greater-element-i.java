class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st=new Stack <> ();
        int n1=nums1.length;
        int n2=nums2.length;
        int res[]=new int[n2];

        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        
        int ans[]=new int[n1];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=res[j];
                    break;
                }
            }
        }

        return ans;
    }
}