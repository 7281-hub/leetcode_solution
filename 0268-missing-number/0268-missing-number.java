class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int currsum = 0;
       int maxsum = n*(n+1)/2;
       for (int i=0; i<n; i++){
         currsum+=nums[i];
       } 
       int ans = maxsum-currsum;
       return ans;
    }
}