// Last updated: 6/15/2025, 5:27:53 PM
class Solution {
    public int minOperations(int[] nums) {
        int count  = 0;
        int n = nums.length;
        for(int i  =0; i< n - 2;i++){
            if (nums[i] == 0){
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;

            }
        }
        for (int num : nums) {
            if (num == 0) return -1;
        }

        return count;
        
    }
}