class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashSet<Integer>set = new HashSet<>();
       int n = grid.length;
       int sq=n*n;
       int ans[] =new int[2];
       int currSum=0;
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(set.contains(grid[i][j])){
                ans[0]=grid[i][j];
            }
            else{
                set.add(grid[i][j]);
                currSum+=grid[i][j];
            }
        }
       }
       int sum=sq*(sq+1)/2;
        ans[1]=sum-currSum;

        return ans;
    }
}