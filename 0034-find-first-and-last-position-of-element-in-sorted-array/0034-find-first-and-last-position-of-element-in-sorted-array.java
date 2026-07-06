class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;
        int first = -1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                // Linear scan outwards to find boundaries
                left = mid;
                while (left >= 0 && nums[left] == target) {
                    left--;
                }
                first = left + 1;

                right = mid;
                while (right < nums.length && nums[right] == target) {
                    right++;
                }
                last = right - 1;
                
                return new int[]{first, last};
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        
        return new int[]{first, last}; 
    }
}