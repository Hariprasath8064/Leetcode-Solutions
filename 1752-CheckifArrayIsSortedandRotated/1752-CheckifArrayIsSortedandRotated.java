// Last updated: 8/28/2025, 7:03:34 PM
class Solution {
    public boolean check(int[] nums) {
        int N = nums.length;
        int count = 1;
        for(int i = 1; i<2*N;i++){
            if(nums[(i-1)%N] <= nums[i%N]){
                count++;
            }
            else{
                count = 1;
            }
            if(count == N){
                return true;
            }
        }

        return N == 1;
    }
}