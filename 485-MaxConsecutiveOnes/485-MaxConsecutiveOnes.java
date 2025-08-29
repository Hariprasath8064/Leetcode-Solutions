// Last updated: 8/30/2025, 12:37:02 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int currcount = 0;
        int n = nums.length;
        for(int i = 0; i < n;i++){
            if(nums[i] == 1){
                currcount += 1;
            }
            else{
                maxcount = Math.max(maxcount,currcount);
                currcount = 0;
            }
        }
        maxcount = Math.max(maxcount,currcount);
        return maxcount;
    }
}