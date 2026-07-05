class Solution {
    public int maxArea(int[] height) {
        int leftHeight=0;
        int rightHeight=height.length-1;
        int maxArea=0;

        while(leftHeight<rightHeight){
            int width=rightHeight-leftHeight;
            int currArea=width*Math.min(height[leftHeight],height[rightHeight]);
            if (currArea>maxArea){
                maxArea=currArea;
            }
            if(height[leftHeight]<height[rightHeight]){
                leftHeight++;
            }
            else{
                rightHeight--;
            }
        }
        return maxArea;
    }
}