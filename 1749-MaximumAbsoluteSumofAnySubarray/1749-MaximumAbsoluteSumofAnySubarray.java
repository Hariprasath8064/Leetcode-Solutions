class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentmax = 0;
        int currentmin = 0;
        int maxsum = 0;
        int minsum = 0;

        for(int num:nums)
        {
            currentmax = Math.max(num , currentmax + num);
            currentmin = Math.min(num , currentmin + num);
            maxsum = Math.max(maxsum,currentmax);
            minsum = Math.min(minsum,currentmin);
        }
        return Math.max(Math.abs(maxsum),Math.abs(minsum));
        
    }
}