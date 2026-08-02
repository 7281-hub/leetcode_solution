class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Base edge case check
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;     // Number of rows
        int n = matrix[0].length;  // Number of columns

        int left = 0;
        int right = m * n - 1;     // Total elements - 1

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Map 1D mid index back to 2D matrix coordinates
            int row = mid / n;
            int col = mid % n;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;    // Target is in the right half
            } else {
                right = mid - 1;   // Target is in the left half
            }
        }

        return false;              // Target not found

        
    }
}