class Solution {
    public int maxProfit(int[] prices) {
        int maxdiffrence = 0;
        int minsofar = prices[0];

        for(int i=1; i<prices.length; i++){
          int currentdiffrence = prices[i]- minsofar;
          if(currentdiffrence > maxdiffrence){
            maxdiffrence = currentdiffrence;
          }
          if(prices[i]<minsofar){
            minsofar=prices[i];
          }
        }
        return maxdiffrence; 
    }
}