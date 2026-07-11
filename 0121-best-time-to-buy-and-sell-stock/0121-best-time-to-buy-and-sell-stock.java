class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int minprice=prices[0];

       for(int i=1; i<prices.length; i++){
        int currProfit=prices[i]-minprice;
        if(currProfit>maxprofit){
            maxprofit = currProfit;
        }
        if(prices[i]<minprice){
            minprice=prices[i];
        }
       }
       return maxprofit;
    }
}