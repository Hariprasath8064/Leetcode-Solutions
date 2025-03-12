class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 0;
        int z = 0;
        for(int i = 0; i< n;i++)
        {
            if (nums[i] > 0 ){
                pos += 1;
            }
            else if(nums[i] < 0){
                neg += 1;
            }
            else{
                z += 1;
            }
        }

        return Math.max(pos,neg);
        
    }
}