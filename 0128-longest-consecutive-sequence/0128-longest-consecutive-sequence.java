class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int start = num;
                while(set.contains(start + 1)) {
                 count++;
                 start++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        return maxLength;
    }
}