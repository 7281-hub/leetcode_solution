class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxInCandies=candies[0];
        for(int i=0; i<candies.length; i++){
         int currMax=candies[i];
            if(currMax>maxInCandies){
                maxInCandies=currMax;
            }
        }
        for(int j=0; j<candies.length; j++){
         if(candies[j]+extraCandies>=maxInCandies){
          ans.add(true);
         }else{
             ans.add(false); 
         }
        }
        return ans;
    }
}