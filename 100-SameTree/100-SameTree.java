// Last updated: 9/6/2025, 5:56:59 PM
class Solution {
    public boolean canJump(int[] nums) {
        int req = 1;
        int start = nums.length - 1;

        for(int i = nums.length - 2;i >= 0;i--){
            if(i + nums[i] >= start){
                start = i;
            }
        }
        return start == 0;
    }
}