// Last updated: 8/30/2025, 12:31:41 AM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = nums.length;
        for(int i = 1 ;i < nums.length;i++){
            if(nums[i] != (nums[i - 1] + 1)){
                return nums[i - 1] + 1;
            }
            else{
                count--;
            }
        }
        if(nums[0] != 0){
            return 0;
        }
        return nums.length;

    }
}