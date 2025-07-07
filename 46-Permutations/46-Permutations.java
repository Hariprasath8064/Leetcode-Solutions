// Last updated: 7/7/2025, 11:39:23 AM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxdiff = 0;
        for(int i = 1 ; i < nums.length; i++){
            int diff = nums[i] - nums[i - 1];
            maxdiff = Math.max(maxdiff,diff);
        }
        return maxdiff;
    }
}