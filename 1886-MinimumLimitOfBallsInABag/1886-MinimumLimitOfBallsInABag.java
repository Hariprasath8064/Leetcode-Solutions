// Last updated: 6/15/2025, 5:28:27 PM
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        while (left < right) {
            int mid = (left + right) / 2;
            if (canDistribute(nums, maxOperations, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canDistribute(int[] nums, int maxOperations, int maxSize) {
        int operations = 0;
        for (int num : nums) {
            operations += (num - 1) / maxSize;
            if (operations > maxOperations) {
                return false;
            }
        }
        return true;
    }
}