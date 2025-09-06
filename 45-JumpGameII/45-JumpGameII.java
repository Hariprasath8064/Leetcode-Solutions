// Last updated: 9/6/2025, 6:11:24 PM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int  target = nums.length - 1;
        while(target > 0){
            for(int i = 0;i < target;i++){
                if(i + nums[i]>= target){
                    target = i;
                    jumps++;
                    break;
                }
            }
        }
        return jumps;
    }
}