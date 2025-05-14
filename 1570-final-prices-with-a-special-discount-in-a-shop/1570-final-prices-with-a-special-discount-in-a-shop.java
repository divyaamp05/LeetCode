class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int nse[]=new int[n];
        Stack <Integer> st=new Stack <> ();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && prices[i]<st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                nse[i]=prices[i];
            }
            else{
                nse[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }

        return nse;
    }
}