class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int mh = nums[0];
        int ms = nums[0];

        for(int i = 1;i<n;i++)
        {
            mh = Math.max(nums[i],mh + nums[i]);
            ms = Math.max(ms,mh);
        }

        return ms;
        
               
        

        

        
    }
}