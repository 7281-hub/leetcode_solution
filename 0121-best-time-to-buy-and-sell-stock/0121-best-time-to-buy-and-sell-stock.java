class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];

        for(int i=1; i<prices.length; i++){
            int currPrice = prices[i];
            int currProfit = prices[i]-minPrice;
            if(currProfit>maxProfit){
                maxProfit=currProfit;
            }
            if(currPrice<minPrice){
                minPrice=currPrice;
            }
        }
        return maxProfit;
    }
}