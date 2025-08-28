// Last updated: 8/29/2025, 12:59:23 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        int j = 1;
        for(int i = 1 ; i < N;i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}