class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int nse[]=new int[n];

        for(int i=0;i<=n-1;i++){
            nse[i]=prices[i];
            for(int j=i+1;j<=n-1;j++){
                if(prices[j] <= prices[i]){
                    nse[i]=prices[i]-prices[j];
                    break;
                }
            }
        }

        return nse;
    }
}