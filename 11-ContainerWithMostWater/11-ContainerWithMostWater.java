// Last updated: 6/20/2025, 12:05:57 AM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n - 1;
        int maxarea = 0;
        int curarea = 0; 

        while(left < right){
            curarea = (Math.min(height[left],height[right]))*(right - left);
            maxarea = Math.max(maxarea,curarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}