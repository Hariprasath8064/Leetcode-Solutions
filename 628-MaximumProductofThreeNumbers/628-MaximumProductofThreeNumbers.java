// Last updated: 7/18/2025, 11:45:47 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n - 1] ,nums[n - 1]*nums[n - 2]*nums[n - 3]);
    }
}