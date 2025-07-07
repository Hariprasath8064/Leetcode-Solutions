// Last updated: 7/7/2025, 12:53:23 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n - 1] ,nums[n - 1]*nums[n - 2]*nums[n - 3]);
    }
}